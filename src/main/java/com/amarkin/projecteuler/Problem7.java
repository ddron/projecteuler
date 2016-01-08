package com.amarkin.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem7 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int maxNumber = 200_000;
        int firstNumber = 2;
        int nth = 10_001;

        int[] arr = getPopulatedArray(maxNumber);

        int maxElemToCheck = (int) Math.sqrt(maxNumber);

        List<Integer> primes = new ArrayList<>();

        for (int i = firstNumber; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            System.out.print(i + " ");
            primes.add(i);
            if (primes.size() == nth) {
                break;
            }
            if (i > maxElemToCheck) {
                continue;
            }

            int k = i;
            for (int j = i * k; j < arr.length; j = i * (++k)) {
                arr[j] = 0;
            }
        }
        System.out.println(primes.get(nth - 1));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static int[] getPopulatedArray(int maxNumber) {
        int[] arr = new int[maxNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
