package io.github.fairyspace.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: onvif-easy
 * π Description:
 * π @author: xuquanru
 * π Create: 2023/1/17
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class AuthUtil {


    public static String createNonce() {
        Random generator = new Random();
        String nonce = "" + generator.nextInt();
        return nonce;
    }

    public static String getEncryptedNonce(String nonce) {

        return Base64.getEncoder().encodeToString(nonce.getBytes());
    }


    /**
     * Returns encrypted version of given password like algorithm like in WS-UsernameToken
     */
    public static String encryptPassword(String password, String nonce) {
        String timestamp = getUTCTime();
        String beforeEncryption = nonce + timestamp + password;
        byte[] encryptedRaw;
        try {
            encryptedRaw = sha1(beforeEncryption);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        String encoded = Base64.getEncoder().encodeToString(encryptedRaw);
        return encoded;
    }

    public static String getUTCTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        String utcTime = sdf.format(cal.getTime());
        return utcTime;
    }


    private static byte[] sha1(String s) throws NoSuchAlgorithmException {
        MessageDigest SHA1 = null;
        SHA1 = MessageDigest.getInstance("SHA1");
        SHA1.reset();
        SHA1.update(s.getBytes());
        byte[] encryptedRaw = SHA1.digest();
        return encryptedRaw;
    }

}
