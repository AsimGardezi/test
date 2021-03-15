package com.disappears.android.encryption;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;

import com.disappears.android.util.DLog;

import org.spongycastle.jce.provider.BouncyCastleProvider;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class SymmetricEncryption {
    private static final String TAG = SymmetricEncryption.class.getSimpleName();
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final Provider PROVIDER = new BouncyCastleProvider();
    private static final String CRYPTOGRAPHY_ALGORITHM = "AES";
    private static final String CRYPTOGRAPHY_ALGO_MODE = "AES/GCM/NoPadding";
    private static final int IV_LENGTH = 16;
    private static final String MD5_DIGEST = "MD5";
    private static final String SALT_SHARED_PREFERENCE = "condiment";

    private static String getSalt(Context c, String input) {
        SharedPreferences prefs = c.getSharedPreferences(SALT_SHARED_PREFERENCE,
                Context.MODE_PRIVATE);
        String reverted = new StringBuilder(input).reverse().toString();
        String hash = String.valueOf(reverted.hashCode());
        String salt = prefs.getString(hash, null);
        if (salt == null) {
            salt = String.valueOf(System.currentTimeMillis());
            prefs.edit().putString(hash, salt).apply();
        }
        return salt;
    }

    private static byte[] preparePassKey(Context c, String input) {
        byte[] hash = getMD5Hash(input);
        byte[] salt = getSalt(c, input).getBytes();
        byte[] passkey = new byte[16];
        for (int i = 0; i < passkey.length; i++) {
            passkey[i] = (((i % 2 == 0) && (salt.length > i)) ? salt[i] : hash[i]);
        }
        return passkey;
    }

    public static String encrypt(Context c, String password, String data) {
        if (TextUtils.isEmpty(password) || TextUtils.isEmpty(data)) {
            throw new InvalidParameterException();
        }
        byte[] clear = toBytesUTF8(data);
        byte[] passkey = preparePassKey(c, password);
        return toBase64(encrypt(passkey, clear));
    }

    public static String encrypt(Context c, SecretKey key, String data) {
        if (key == null || TextUtils.isEmpty(data)) {
            throw new InvalidParameterException();
        }
        byte[] clear = toBytesUTF8(data);
        return toBase64(encrypt(key, clear));
    }

    private static InputStream processStream(byte[] passKey, byte iv[], InputStream is, int cipherMode) {
        try {
            final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
            final IvParameterSpec ivParameter = new IvParameterSpec(iv);
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            cipher.init(cipherMode, key, ivParameter);
            return new CipherInputStream(is, cipher);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException
                | NoSuchPaddingException | NoSuchAlgorithmException ike) {
            ike.printStackTrace();
        }
        return is;
    }

    private static OutputStream processStream(byte[] passKey, OutputStream out, int cipherMode) {
        try {
            final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
            final IvParameterSpec ivParameter = new IvParameterSpec(new byte[IV_LENGTH]);
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            cipher.init(cipherMode, key, ivParameter);

            return new CipherOutputStream(out, cipher);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException
                | NoSuchAlgorithmException | NoSuchPaddingException ike) {
            ike.printStackTrace();
        }
        return out;
    }

    private static OutputStream processStream(byte[] passKey, byte[] iv, OutputStream out, int cipherMode) {
        try {
            final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
            final IvParameterSpec ivParameter = new IvParameterSpec(iv);
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            cipher.init(cipherMode, key, ivParameter);

            return new CipherOutputStream(out, cipher);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException
                | NoSuchAlgorithmException | NoSuchPaddingException ike) {
            ike.printStackTrace();
        }
        return out;
    }

    public static OutputStream encryptStream(byte[] passKey, byte[] iv, OutputStream out) {
        return processStream(passKey, iv, out, Cipher.ENCRYPT_MODE);
    }

    public static String toBase64(byte[] input) {
        return Base64.encodeToString(input, Base64.NO_WRAP | Base64.URL_SAFE);
    }

    public static byte[] fromBase64(String input) {
        return Base64.decode(input, Base64.NO_WRAP | Base64.URL_SAFE);
    }

    public static byte[] toBytesUTF8(String text) {
        return text.getBytes(DEFAULT_CHARSET);
    }

    public static String fromBytesUTF8(byte[] text) {
        return new String(text, DEFAULT_CHARSET);
    }

    public static String[] toString(KeyPair keyPair) {
        return new String[]{toBase64(keyPair.getPrivate().getEncoded()),
                toBase64(keyPair.getPublic().getEncoded())
        };
    }

    public static byte[] encrypt(byte[] passKey, byte[] clear) {
        byte[] result = null;
        try {
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            final SecureRandom random = new SecureRandom();
            final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
            final byte[] iv = new byte[IV_LENGTH];
            random.nextBytes(iv);
            final IvParameterSpec ivParameter = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameter);
            final byte[] encryptedData = cipher.doFinal(clear);
            if ((encryptedData != null) && (encryptedData.length > 0)) {
                result = new byte[IV_LENGTH + encryptedData.length];
                System.arraycopy(iv, 0, result, 0, IV_LENGTH);
                System.arraycopy(encryptedData, 0, result, IV_LENGTH, encryptedData.length);
            } else {
                DLog.INSTANCE.e(TAG, "Error applying transformation.");
            }
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static byte[] encrypt(SecretKey key, byte[] clear) {
        byte[] result = null;
        try {
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            final SecureRandom random = new SecureRandom();
            final byte[] iv = new byte[IV_LENGTH];
            random.nextBytes(iv);
            final IvParameterSpec ivParameter = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameter);
            final byte[] encryptedData = cipher.doFinal(clear);
            if ((encryptedData != null) && (encryptedData.length > 0)) {
                result = new byte[IV_LENGTH + encryptedData.length];
                System.arraycopy(iv, 0, result, 0, IV_LENGTH);
                System.arraycopy(encryptedData, 0, result, IV_LENGTH, encryptedData.length);
            } else {
                DLog.INSTANCE.e(TAG, "Error applying transformation.");
            }
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static byte[] encrypt(byte[] passKey, byte[] iv, byte[] clear) {
        byte[] result = null;
        try {
            final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
            final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
            final IvParameterSpec ivParameter = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameter);
            result = cipher.doFinal(clear);
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | NoSuchPaddingException | InvalidKeyException | NoSuchAlgorithmException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static String decrypt(Context c, String password, String encryptedStr) {
        if (TextUtils.isEmpty(password) || TextUtils.isEmpty(encryptedStr)) {
            throw new InvalidParameterException();
        }
        byte[] passkey = preparePassKey(c, password);
        byte[] encrypted = fromBase64(encryptedStr);
        return fromBytesUTF8(decrypt(passkey, encrypted));
    }

    public static String decrypt(Context c, SecretKey key, String encryptedStr) throws InvalidParameterException {
        if (key == null || TextUtils.isEmpty(encryptedStr)) {
            throw new InvalidParameterException();
        }
        byte[] encrypted = fromBase64(encryptedStr);
        return fromBytesUTF8(decrypt(key, encrypted));
    }

    public static InputStream decryptStream(byte[] passKey, byte[] iv, InputStream is) {
        return processStream(passKey, iv, is, Cipher.DECRYPT_MODE);
    }

    public static OutputStream decryptStream(byte[] passKey, OutputStream out) {
        return processStream(passKey, out, Cipher.DECRYPT_MODE);
    }

    public static byte[] decrypt(byte[] passKey, byte[] encrypted) {
        byte[] result = null;
        try {
            if ((encrypted != null) && (encrypted.length > IV_LENGTH)) {
                final byte[] iv = new byte[IV_LENGTH];
                final int encryptedDataSize = (encrypted.length - IV_LENGTH);
                final byte[] encryptedData = new byte[encryptedDataSize];
                System.arraycopy(encrypted, 0, iv, 0, IV_LENGTH);
                System.arraycopy(encrypted, IV_LENGTH, encryptedData, 0, encryptedDataSize);
                final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
                final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
                final IvParameterSpec ivParameter = new IvParameterSpec(iv);
                cipher.init(Cipher.DECRYPT_MODE, key, ivParameter);
                result = cipher.doFinal(encryptedData);
            } else {
                DLog.INSTANCE.e(TAG, "Error reversing transformation.");
            }
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static byte[] decrypt(SecretKey key, byte[] encrypted) {
        byte[] result = null;
        try {
            if ((encrypted != null) && (encrypted.length > IV_LENGTH)) {
                final byte[] iv = new byte[IV_LENGTH];
                final int encryptedDataSize = (encrypted.length - IV_LENGTH);
                final byte[] encryptedData = new byte[encryptedDataSize];
                System.arraycopy(encrypted, 0, iv, 0, IV_LENGTH);
                System.arraycopy(encrypted, IV_LENGTH, encryptedData, 0, encryptedDataSize);

                final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
                final IvParameterSpec ivParameter = new IvParameterSpec(iv);
                cipher.init(Cipher.DECRYPT_MODE, key, ivParameter);
                result = cipher.doFinal(encryptedData);
            } else {
                DLog.INSTANCE.e(TAG, "Error reversing transformation.");
            }
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static byte[] decrypt(byte[] passKey, byte[] iv, byte[] encrypted) {
        byte[] result = null;
        try {
            if (encrypted != null) {
                final Cipher cipher = Cipher.getInstance(CRYPTOGRAPHY_ALGO_MODE, PROVIDER);
                final SecretKey key = new SecretKeySpec(passKey, CRYPTOGRAPHY_ALGORITHM);
                final IvParameterSpec ivParameter = new IvParameterSpec(iv);
                cipher.init(Cipher.DECRYPT_MODE, key, ivParameter);
                result = cipher.doFinal(encrypted);
            } else {
                DLog.INSTANCE.e(TAG, "Error reversing transformation.");
            }
        } catch (BadPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException
                | NoSuchPaddingException | InvalidKeyException | NoSuchAlgorithmException bpe) {
            bpe.printStackTrace();
        }
        return result;
    }

    public static byte[] getMD5Hash(String input) {
        try {
            MessageDigest md5 = MessageDigest.getInstance(MD5_DIGEST, PROVIDER);
            md5.update(toBytesUTF8(input), 0, input.length());
            return md5.digest();
        } catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return null;
    }
}
