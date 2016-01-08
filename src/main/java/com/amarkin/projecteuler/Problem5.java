package com.amarkin.projecteuler;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem5 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        // 2 = 2
        // 3 = 3
        // 4 = 2 * 2
        // 5 = 5
        // 6 = 2 * 3
        // 7 = 7
        // 8 = 2 * 2 * 2
        // 9 = 3 * 3
        // 10 = 2 * 5
        // 11 = 11
        // 12 = 2 * 2 * 3
        // 13 = 13
        // 14 = 2 * 7
        // 15 = 3 * 5
        // 16 = 2 * 2 * 2 * 2
        // 17 = 17
        // 18 = 2 * 3 * 3
        // 19 = 19
        // 20 = 2 * 2 * 5

        System.out.println(2 * 2 * 2 * 2 * 3 * 3 * 5 * 7 * 11 * 13 * 17 * 19);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
