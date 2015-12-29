package com.amarkin.projecteuler;

/**
 * Created by amarkin on 12/6/2015.
 */
public class Problem21 {

    public static void main(String[] args) {

        int totalSum = 0;
        for (int i = 2; i < 10000; i++) {
            int sum = sumOfDivisors(i);
            int otherSum = sumOfDivisors(sum);
            if (i == otherSum && sum != i) {
                totalSum += i;
                System.out.println(i);
            }
        }
        System.out.println(totalSum);

    }

    private static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum +=i;
            }
        }
        return sum;
    }

}
