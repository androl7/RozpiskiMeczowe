package com.example.adam.rozpiskimeczowe;

import java.security.SecureRandom;

public class GenerateKey{

        private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        private static SecureRandom rnd = new SecureRandom();

    public static String randomString(){
        int len = 6;
        StringBuilder sb = new StringBuilder(len);
            for(int i = 0; i < len; i++ )
                sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
            return sb.toString();
        }
}
