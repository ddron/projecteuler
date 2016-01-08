package com.amarkin.projecteuler;

import java.math.BigDecimal;

/**
 * Created by amarkin on 6/28/2015.
 */
public class Problem16 {

    public static void main(String[] args) {
        String s = new BigDecimal(Math.pow(2, 1000)).toString();
        System.out.println(s);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = Character.getNumericValue(s.charAt(i));
            sum += d;
        }
        System.out.println(sum);

    }


}
