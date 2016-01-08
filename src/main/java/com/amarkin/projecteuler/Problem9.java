package com.amarkin.projecteuler;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem9 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        for (int i = 1; i < 1_000; i++) {
            for (int j = 1; j < 1_000; j++) {
                if (1_000 * i + 1_000 * j - i * j == 500_000) {
                    if (i < j) {
                        a = i;
                        b = j;
                        System.out.println("a=" + i + "; b=" + j);
                        break;
                    }
                }
            }
            if (a != 0 && b != 0) {
                break;
            }
        }

        System.out.println(a * b * (1000 - a - b));
    }

}
