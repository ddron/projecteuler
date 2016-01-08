package com.amarkin.projecteuler;

/**
 * Created by amarkin on 7/1/2015.
 */
public class Problem17 {

    private static final String[] DIGITS = new String[] {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };

    private static final String[] ELEVEN_TO_NINETEEN = new String[] {
            "",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private static final String[] TENS = new String[] {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private static final String[] HUNDREDS = new String[] {
            "",
            "onehundred",
            "twohundred",
            "threehundred",
            "fourhundred",
            "fivehundred",
            "sixhundred",
            "sevenhundred",
            "eighthundred",
            "ninehundred"
    };

    private static final String ONE_THOUSAND = "onethousand";
    private static final String AND = "and";

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < HUNDREDS.length; i++) {
            for (int j = 0; j < TENS.length; j++) {
                for (int k = 0; k < DIGITS.length; k++) {
                    if (i == 0) {
                        if (j == 0 && k == 0) {
                            continue;
                        } else if (j == 0) {
                            String s = DIGITS[k];
                            System.out.println(s);
                            sum += s.length();
                        } else if (k == 0) {
                            String s = TENS[j];
                            System.out.println(s);
                            sum += s.length();
                        } else if (j == 1) {
                            String s = ELEVEN_TO_NINETEEN[k];
                            System.out.println(s);
                            sum += s.length();
                        } else {
                            String s = TENS[j] + DIGITS[k];
                            System.out.println(s);
                            sum += s.length();
                        }
                    } else {
                        if (j == 0 && k == 0) {
                            String s = HUNDREDS[i];
                            System.out.println(s);
                            sum += s.length();
                        } else if (j == 0) {
                            String s = HUNDREDS[i] + AND + DIGITS[k];
                            System.out.println(s);
                            sum += s.length();
                        } else if (k == 0) {
                            String s = HUNDREDS[i] + AND + TENS[j];
                            System.out.println(s);
                            sum += s.length();
                        } else if (j == 1) {
                            String s = HUNDREDS[i] + AND + ELEVEN_TO_NINETEEN[k];
                            System.out.println(s);
                            sum += s.length();
                        } else {
                            String s = HUNDREDS[i] + AND + TENS[j] + DIGITS[k];
                            System.out.println(s);
                            sum += s.length();
                        }
                    }
                }
            }
        }

        String s = ONE_THOUSAND;
        System.out.println(s);
        sum += s.length();

        System.out.println(sum);
    }



}
