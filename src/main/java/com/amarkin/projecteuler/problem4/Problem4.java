package com.amarkin.projecteuler.problem4;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem4 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int from = 100;
        int to = 999;
        int maxPalindrome = 0;
        for (int k = from; k <= to; k++) {
            for (int j = from; j <= to; j++) {
                int m = k * j;
                if (isPalindrome(m) && m > maxPalindrome) {
                    maxPalindrome = m;
                    System.out.println(k + " * " + j + " = " + (k * j));
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("maxPalindrome = " + maxPalindrome);
        System.out.println(end - start);
    }

    private static int getDigitsNumber(int n) {
        int digits = 1;
        for (int i = 10; n / i >= 1; i *= 10) {
            digits++;
        }
        return digits;
    }

    private static int getDigitAt(int n, int position) {
        return (n / (int) Math.pow(10, position - 1)) % 10;
    }

    private static boolean isPalindrome(int n) {
        int digits = getDigitsNumber(n);
        for (int i = 1; i <= digits / 2; i++) {
            if (getDigitAt(n, i) != getDigitAt(n, digits + 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
