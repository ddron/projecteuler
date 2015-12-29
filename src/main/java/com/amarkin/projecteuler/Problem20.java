package com.amarkin.projecteuler;

import java.math.BigInteger;

/**
 * Created by amarkin on 12/6/2015.
 */
public class Problem20 {

    public static void main(String[] args) {
        long n = 100;
        BigInteger f = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(String.valueOf(i)));
        }

        String str = f.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }



}
