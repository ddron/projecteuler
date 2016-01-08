package com.amarkin.projecteuler;

import java.util.Arrays;

/**
 * Created by amarkin on 6/28/2015.
 */
public class Problem15 {

    public static void main(String[] args) {
        long[][] arr = new long[21][21];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        for (long[] anArr : arr) {
            System.out.println(Arrays.toString(anArr));
        }
        System.out.println(arr[arr.length - 1][arr.length - 1]);
    }

}
