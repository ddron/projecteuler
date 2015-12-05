package com.amarkin.projecteuler.problem3;

/**
 * Created by amarkin on 6/11/2015.
 */
public class Problem3 {
    public static void main(String[] args) {
        long n = 600_851_475_143L;
        long start = System.currentTimeMillis();
        for (long k = 1; k <= n / 2; k++) {
            if (n % k == 0) {
                if (isPrime(n / k)) {
                    System.out.println(n / k);
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


    private static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
