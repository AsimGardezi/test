package com.disappears.android.encryption;

import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.util.encoders.Base64;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

public class CryptoUtil {
    static {
        Security.removeProvider("SC");
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
    }

    public static final String ECDH = "ECDH";
    public static final String AES = "AES";
    public static final String PROVIDER = "SC";
    public static final String CURVE_NAME = "secp521r1";
    public static final String ECDSA = "ECDSA";
    public static final String SHA_256_WITH_ECDSA = "SHA256withECDSA";
    public static final String BEGIN_PUBLIC_KEY = "-----BEGIN PUBLIC KEY-----\n";
    public static final String END_PUBLIC_KEY = "\n-----END PUBLIC KEY-----";

    public static KeyPair generateECDHKeyPair() throws NoSuchAlgorithmException,
            NoSuchProviderException,
            InvalidAlgorithmParameterException {
        KeyPairGenerator kpgen = KeyPairGenerator.getInstance(ECDH, PROVIDER);
        kpgen.initialize(new ECGenParameterSpec(CURVE_NAME), new SecureRandom());
        return kpgen.generateKeyPair();
    }

    public static KeyPair generateECDSAKeyPair() throws NoSuchAlgorithmException,
            NoSuchProviderException,
            InvalidAlgorithmParameterException {
        KeyPairGenerator kpgen = KeyPairGenerator.getInstance(ECDSA, PROVIDER);
        kpgen.initialize(new ECGenParameterSpec(CURVE_NAME), new SecureRandom());
        return kpgen.generateKeyPair();
    }

    public static String getKeyEncodedPem(byte[] data) {
        return BEGIN_PUBLIC_KEY + encodeBase64(data) + END_PUBLIC_KEY;
    }

    public static String encodeBase64(byte[] data) {
        return new String(Base64.encode(data));
    }

    public static byte[] decodeBase64(String data) {
        return Base64.decode(data);
    }

    public static PrivateKey getPrivKeyFromRawData(byte[] data, String algorithm) throws NoSuchProviderException,
            NoSuchAlgorithmException,
            InvalidKeySpecException {
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(data);
        KeyFactory kf = KeyFactory.getInstance(algorithm, PROVIDER);
        return kf.generatePrivate(spec);
    }

    public static PublicKey getPubKeyFromRawData(byte[] data, String algorithm) throws NoSuchProviderException,
            NoSuchAlgorithmException,
            InvalidKeySpecException {
        X509EncodedKeySpec spec = new X509EncodedKeySpec(data);
        KeyFactory kf = KeyFactory.getInstance(algorithm, PROVIDER);
        return kf.generatePublic(spec);
    }

    public static String getAuthSignatureForUser(String username,
                                                 String derivedPassword,
                                                 PrivateKey key) throws NoSuchAlgorithmException,
            NoSuchProviderException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        Signature s = Signature.getInstance(SHA_256_WITH_ECDSA, PROVIDER);
        s.initSign(key);
        s.update((username + derivedPassword).getBytes());
        byte[] signedData = s.sign();
        return encodeBase64(signedData);
    }

    public static String stripPEMKey(String key) {
        return key.replace(BEGIN_PUBLIC_KEY, "").replace(END_PUBLIC_KEY,
                "").replace("\\s", "");
    }

    public static String generateSharedSecret(String dhPriv, String dhPub) throws NoSuchAlgorithmException,
            NoSuchProviderException,
            InvalidKeySpecException,
            InvalidKeyException {
        PrivateKey priv = CryptoUtil.getPrivKeyFromRawData(decodeBase64(stripPEMKey(dhPriv)), ECDH);
        PublicKey pub = CryptoUtil.getPubKeyFromRawData(decodeBase64(stripPEMKey(dhPub)), ECDH);
        KeyAgreement keyAgreement = KeyAgreement.getInstance(ECDH, PROVIDER);
        keyAgreement.init(priv);
        keyAgreement.doPhase(pub, true);
        SecretKey data = keyAgreement.generateSecret(AES);
        return CryptoUtil.encodeBase64(data.getEncoded());
    }
}
