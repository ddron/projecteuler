package com.amarkin.projecteuler.problem6;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem6 {

    public static void main(String[] args) {
        long sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
        }
        int sum = (1 + 100) * 100 / 2;

        System.out.println(sum * sum - sumOfSquares);
    }

}
