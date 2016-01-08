package com.amarkin.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarkin on 1/8/2016.
 */
public class Problem23 {

    private static final int max = 28123;

    public static void main(String[] args) {
        List<Integer> abundantNumbers = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (isAbundantNumber(i)) {
                abundantNumbers.add(i);
            }
        }

        int[] candidates = new int[max];
        for (int i = 0; i < abundantNumbers.size(); i++) {
            int n1 = abundantNumbers.get(i);
            for (int j = i; j < abundantNumbers.size(); j++) {
                int n2 = abundantNumbers.get(j);
                if (n1 + n2 > max) {
                    break;
                } else {
                    candidates[n1 + n2 - 1] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < candidates.length; i++) {
            int number = candidates[i];
            if (number == 0) {
                sum += i + 1;
            }
        }
        System.out.println(sum);
    }

    private static boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                if (sum > n ) {
                    return true;
                }
            }
        }
        return false;
    }

}
