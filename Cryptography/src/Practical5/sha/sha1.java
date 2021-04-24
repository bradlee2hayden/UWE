/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical5.sha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Administrator
 */
public class sha1 {

    private final static char[] hexArray = "0123456789abcdef".toCharArray();

    public static byte[] encode(byte[] text, int offset, int length) {
        //MessageDigest class provides applications the functionality of a message digest algorithm
        //Message digests are secure one-way hash functions that take arbitrary-sized data and output a fixed-length hash value. for sha1
        MessageDigest md;
        byte[] sha1hash = {};

        try {
            md = MessageDigest.getInstance("sha1");
            md.update(text, offset, length);
            sha1hash = md.digest();
        } catch (NoSuchAlgorithmException e) {
            // handle exceptions and errors.
            //It is a method of Java’s throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
            //printStackTrace() will pinpoint the exact line in which the method raised the exception.

        }

        return sha1hash;
    }

    public static String encode(byte[] text) {
        return convertToHex(encode(text, 0, text.length));
    }

    private static String convertToHex(byte[] data) {
        char[] hexChars = new char[data.length * 2];
        for (int j = 0; j < data.length; j++) {
            int v = data[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

}
