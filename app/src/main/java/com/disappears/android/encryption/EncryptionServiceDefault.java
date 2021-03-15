package com.disappears.android.encryption;

import android.content.Context;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.crashlytics.android.Crashlytics;
import com.disappears.android.api.Constants;
import com.disappears.android.model.Identity;
import com.disappears.android.model.User;
import com.disappears.android.model.response.PublicKeyData;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryptionServiceDefault implements EncryptionService {
    private static final String TAG = EncryptionService.class.getName();
    private static final String KEY_ALIAS = "aes_secret";
    private static final int AES_LENGTH = 256;
    private static final int SALT_LENGTH = 16;
    private static final int IV_LENGTH = 16;
    private static final int ITERATION_COUNT = 1000;
    private static final String KEYSTORE_SUFFIX = ".ks";

    private Context context;
    private KeyStore keyStore;
    private File keyStoreFile;
    private File keyStoreDir;

    public EncryptionServiceDefault(Context c) {
        context = c;
    }

    @Override
    public boolean loadKeyStore(String forUsername) {
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStoreDir = getKeyStoreDir();
            keyStoreFile = new File(keyStoreDir, forUsername + KEYSTORE_SUFFIX);
            if (keyStoreFile.exists()) {
                keyStore.load(new FileInputStream(keyStoreFile), "".toCharArray());
                return true;
            }
        } catch (CertificateException | NoSuchAlgorithmException | IOException | KeyStoreException e) {
            Crashlytics.logException(e);
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean createKeyStore(String forUsername) {
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStoreDir = getKeyStoreDir();
            keyStoreFile = new File(keyStoreDir, forUsername + KEYSTORE_SUFFIX);
            if (keyStoreFile.exists()) {
                keyStore.load(new FileInputStream(keyStoreFile), "".toCharArray());
            } else {
                keyStore.load(null, "".toCharArray());
            }
            generateAndStoreAESKey();
            return true;
        } catch (CertificateException | NoSuchAlgorithmException | IOException | KeyStoreException e) {
            Crashlytics.logException(e);
            e.printStackTrace();
        }
        return false;
    }

    @NonNull
    private File getKeyStoreDir() {
        return context.getDir("KeyStore", Context.MODE_PRIVATE);
    }

    @NonNull
    private File getSharedSecretDir() {
        return context.getDir("Secrets", Context.MODE_PRIVATE);
    }

    private void generateAndStoreAESKey() {
        try {
            if (!keyStore.containsAlias(KEY_ALIAS)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(AES_LENGTH);
                SecretKey key = keyGenerator.generateKey();
                KeyStore.SecretKeyEntry entry = new KeyStore.SecretKeyEntry(key);
                keyStore.setEntry(KEY_ALIAS, entry, null);
                keyStore.store(new FileOutputStream(keyStoreFile), "".toCharArray());
            }
        } catch (NoSuchAlgorithmException | KeyStoreException | CertificateException | IOException e) {
            e.printStackTrace();
        }
    }

    private SecretKey getAesSecretKey() {
        try {
            if (keyStore.containsAlias(KEY_ALIAS)) {
                KeyStore.SecretKeyEntry entry = (KeyStore.SecretKeyEntry) keyStore.getEntry(KEY_ALIAS, null);
                return entry.getSecretKey();
            }
        } catch (NoSuchAlgorithmException | KeyStoreException | UnrecoverableEntryException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    private String loadFileAsAString(File dir, String fileName) {
        FileInputStream fis;
        try {
            File file = new File(dir, fileName);
            if (!file.exists()) {
                return null;
            }
            fis = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            StringBuilder key = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                key.append(line);
            }
            reader.close();
            return key.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public KeyPair generateECDSAKeyPair() {
        try {
            return CryptoUtil.generateECDSAKeyPair();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public KeyPair generateECDHKeyPair() {
        try {
            return CryptoUtil.generateECDHKeyPair();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean storeIdentity(@NotNull Identity identity) {
        Gson gson = new Gson();
        String identityString = gson.toJson(identity);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(new File(keyStoreDir, identity.getUsername()));
            SecretKey key = getAesSecretKey();
            String keyEncrypted = SymmetricEncryption.encrypt(context, key, identityString);
            fos.write(keyEncrypted.getBytes());
            fos.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateIdentity(String name, String authCookie) {
        Gson gson = new Gson();
        Identity i = getIndentity(name);
        i.setCookie(authCookie);
        String identityString = gson.toJson(i);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(new File(keyStoreDir, i.getUsername()));
            SecretKey key = getAesSecretKey();
            String keyEncrypted = SymmetricEncryption.encrypt(context, key, identityString);
            fos.write(keyEncrypted.getBytes());
            fos.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String generateSharedSecret(String currentUser,
                                       String currentVersion,
                                       String friendName,
                                       PublicKeyData friendData) {
        String key = currentUser + currentVersion + friendName + friendData.getVersion();
        String secret = lookupInCache(key);
        if (!TextUtils.isEmpty(secret)) {
            return secret;
        }
        try {
            Identity i = getIndentity(currentUser);
            secret = CryptoUtil.generateSharedSecret(i.getDhPriv(), friendData.getDhPub());
            cacheSecret(key, secret);
            return secret;
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String decryptMessage(String data,
                                 String currentUser,
                                 String currentVersion,
                                 String peerUsername,
                                 PublicKeyData friendKey,
                                 String iv) {
        String secret = generateSharedSecret(currentUser, currentVersion, peerUsername, friendKey);
        byte ivbyte[] = CryptoUtil.decodeBase64(iv);
        byte[] decrypted = SymmetricEncryption.decrypt(CryptoUtil.decodeBase64(secret),
                ivbyte,
                CryptoUtil.decodeBase64(data));
        return new String(decrypted);
    }

    @Override
    public String encryptMessage(String data,
                                 String currentUser,
                                 String currentVersion,
                                 String peerUsername,
                                 PublicKeyData friendKeyData,
                                 String iv) {
        String secret = generateSharedSecret(currentUser, currentVersion, peerUsername, friendKeyData);
        byte ivbyte[] = CryptoUtil.decodeBase64(iv);
        byte[] encrypted = SymmetricEncryption.encrypt(CryptoUtil.decodeBase64(secret), ivbyte, data.getBytes());
        return CryptoUtil.encodeBase64(encrypted);
    }

    @Override
    public File encryptFile(
            @NotNull File src,
            @NotNull File dst,
            @NotNull String currentUser,
            @NotNull String currentVersion,
            @NotNull String peerUsername,
            @NotNull PublicKeyData friendKeyData,
            @NotNull String iv) {

        String secret = generateSharedSecret(currentUser, currentVersion, peerUsername, friendKeyData);
        byte ivbyte[] = CryptoUtil.decodeBase64(iv);
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dst);
            OutputStream encryptedStream = SymmetricEncryption.encryptStream(CryptoUtil.decodeBase64(secret),
                    ivbyte,
                    fos);
            byte[] buffer = new byte[8192];
            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                encryptedStream.write(buffer, 0, read);
            }
            encryptedStream.close();
            fis.close();
            return dst;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public File decryptStream(InputStream stream,
                              File dst,
                              String currentUser,
                              String currentVersion,
                              String peerUsername,
                              PublicKeyData friendKeyData,
                              String iv) {
        String secret = generateSharedSecret(currentUser, currentVersion, peerUsername, friendKeyData);
        byte ivbyte[] = CryptoUtil.decodeBase64(iv);
        try {
            InputStream decryptedStream = SymmetricEncryption.decryptStream(CryptoUtil.decodeBase64(secret),
                    ivbyte,
                    stream);
            FileOutputStream fos = new FileOutputStream(dst);
            byte[] buffer = new byte[8192];
            int read;
            while ((read = decryptedStream.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
            decryptedStream.close();
            fos.flush();
            fos.close();
            stream.close();
            return dst;
        } catch (IOException e) {
            Crashlytics.logException(e);
            e.printStackTrace();
        }
        return null;
    }

    private String lookupInCache(String key) {
        return loadFileAsAString(getSharedSecretDir(), key);
    }

    private boolean cacheSecret(String key, String secret) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(new File(getSharedSecretDir(), key));
            fos.write(secret.getBytes());
            fos.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Identity getIndentity(String username) {
        Gson gson = new Gson();
        String contents = loadFileAsAString(keyStoreDir, username);
        String decrypted = SymmetricEncryption.decrypt(context, getAesSecretKey(), contents);
        return gson.fromJson(decrypted, Identity.class);
    }

    @Override
    public String exportIdentity(String username) {
        Gson gson = new Gson();
        String contents = loadFileAsAString(keyStoreDir, username);
        String decrypted = SymmetricEncryption.decrypt(context, getAesSecretKey(), contents);
        return decrypted;
    }

    @Override
    public String generateAuthSignature(String username, String derivedPassword, PrivateKey privateKey) {
        try {
            return CryptoUtil.getAuthSignatureForUser(username, derivedPassword, privateKey);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException | SignatureException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String generateAuthSignature(String username, String derivedPassword, String base64Key) {
        try {
            PrivateKey key = CryptoUtil.getPrivKeyFromRawData(CryptoUtil.decodeBase64(base64Key), CryptoUtil.ECDSA);
            return CryptoUtil.getAuthSignatureForUser(username, derivedPassword, key);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException | SignatureException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String[] deriveKeyFromPassword(String password) {
        byte[] salt = new byte[SALT_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
        PKCS5S2ParametersGenerator generator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        generator.init(PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(password.toCharArray()), salt, ITERATION_COUNT);
        KeyParameter key = (KeyParameter) generator.generateDerivedMacParameters(AES_LENGTH);
        return new String[]{CryptoUtil.encodeBase64(salt), CryptoUtil.encodeBase64(key.getKey())};
    }

    @Override
    public String generateIv() {
        final SecureRandom random = new SecureRandom();
        final byte[] iv = new byte[IV_LENGTH];
        random.nextBytes(iv);
        return CryptoUtil.encodeBase64(iv);
    }

    @Nullable
    @Override
    public User buildUserObjectForLogin(String deviceId, String username, String password) {
        final User user;
        if (loadKeyStore(username)) {
            Identity i = getIndentity(username);
            user = new User(username, deriveKeyFromPassword(i.getSalt(), password));
            user.setAuthSig(generateAuthSignature(i.getUsername(), user.getPassword(), i.getDsaPriv()));
        } else {
            return null;
        }
        user.setVersion(Constants.Api.INSTANCE.getAPI_VERSION());
        user.setPlatform(Constants.Api.INSTANCE.getPLATFORM());
        user.setGcmId(deviceId);
        return user;
    }

    @Override
    public String deriveKeyFromPassword(String saltBase64, String password) {
        PKCS5S2ParametersGenerator generator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        generator.init(PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(password.toCharArray()),
                CryptoUtil.decodeBase64(saltBase64),
                ITERATION_COUNT);
        KeyParameter key = (KeyParameter) generator.generateDerivedMacParameters(AES_LENGTH);
        return CryptoUtil.encodeBase64(key.getKey());
    }
}
