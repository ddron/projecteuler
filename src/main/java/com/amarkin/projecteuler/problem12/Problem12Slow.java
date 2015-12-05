package com.amarkin.projecteuler.problem12;

import java.util.*;

/**
 * Created by amarkin on 6/14/2015.
 */
public class Problem12Slow {

    private static final long MAX_NUMBER_TO_CHECK = 100_000_000;

    private static final long DELTA = 50_000_000;
    private static final long PRIMES_TO = 50_000_000;

    private static final int EXPECTED_PRIMES_COUNT = 4_000_000;

    private static final long START_FROM = 1;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long[] primes = getAllPrimesBelow(PRIMES_TO);

        long number = 1;
        long delta = 2;
        int n = 1;
        int max = n;

        while (number < START_FROM) {
            number = nextTriangleNumber(number, delta++);
        }

        while (number < MAX_NUMBER_TO_CHECK && (n = numberOfDivisors(primes, number, max)) <= 500) {
            if (n > max) {
                max = n;
            }
            number = nextTriangleNumber(number, delta++);
        }

        System.out.println(number);

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start));
    }

    private static long[] getAllPrimesBelow(long total) {
        long start = System.currentTimeMillis();

        long delta = DELTA;
        long[] primes = new long[EXPECTED_PRIMES_COUNT];
        int index = 0;
        long[] arr = new long[(int) DELTA];
        for (long i = 0; i <= total - delta; i = i + delta) {
            index = getAllPrimesInBetween(arr, primes, index, i, i + delta);
        }
        System.out.println("Total number of primes: " + index);

        long end = System.currentTimeMillis();
        System.out.println("Total time taken to get primes: " + (end - start));

        return primes;
    }

    private static int getAllPrimesInBetween(long arr[], long[] primes, int index, long from, long to) {
        long start = System.currentTimeMillis();

        int firstNumber = 2;

        getPopulatedArray(arr, from, to);

        int maxElemToCheck = (int) Math.sqrt(to);


        for (long i = firstNumber; i < to; i++) {
            if (i >= from && arr[(int) (i - from)] == 0) {
                continue;
            }
            if (i >= from) {
                primes[index++] = i;
            }
            if (i > maxElemToCheck) {
                continue;
            }

            long k = i * i < from ? (from / i) : i;
            for (long j = i * k; j < to; j = i * (++k)) {
                if (j < from) {
                    continue;
                }
                arr[(int) (j - from)] = 0;
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Time to get all primes from " + from + " to " + to + ": " + (end - start) + " ms.");
        System.out.println("Number of primes: " + index);

        return index;
    }

    // from - incl
    // to - excl
    // length = to - from
    private static long[] getPopulatedArray(long[] arr, long from, long to) {
        long start = System.currentTimeMillis();
        for (long i = from; i < to; i++) {
            arr[(int) (i - from)] = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time to populate array from " + from + " to " + to + ": " + (end - start) + " ms.");
        return arr;
    }

    private static int numberOfDivisors(long[] primes, long n, int max) {
        int divisors = 1;
        for (long prime : primes) {
            if (prime == 0 || prime > n) {
                break;
            }
            if (n % prime == 0) {
                int i = 2; // for '0' and '1'
                long k = prime * prime;
                while (n % k == 0) {
                    i++;
                    k *= prime;
                }
                divisors *= i;
            }
        }

        if (divisors > max) {
            max = divisors;
        }

        System.out.println(n + ": " + divisors + " (max=" + (max > divisors ? max : divisors) + ")");
        return divisors;
    }

    private static long nextTriangleNumber(long prev, long delta) {
        return prev + delta;
    }

}
