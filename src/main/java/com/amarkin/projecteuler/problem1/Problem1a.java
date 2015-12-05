package com.amarkin.projecteuler.problem1;

/**
 * Created by amarkin on 5/24/2015.
 */
public class Problem1a {

    public static void main(String[] args) {
        int maxNumber = 1000;
        //int maxNumber = 10;

        int sum = 0;
        for (int i = 1; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
