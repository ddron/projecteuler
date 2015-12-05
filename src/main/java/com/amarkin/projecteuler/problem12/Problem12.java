package com.amarkin.projecteuler.problem12;

/**
 * Created by amarkin on 6/27/2015.
 */
public class Problem12 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long n = 1;
        long delta = 2;
        long count = 0;
        long max = count;

        while(count <= 500) {
            n += delta++;
            count = 0;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count += 2;
                }
            }
            if (count > max) {
                max = count;
            }
            System.out.println(n + ": " + count + " (max=" + max + ")");
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start));
    }
}
