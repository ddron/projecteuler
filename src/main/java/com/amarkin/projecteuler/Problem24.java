package com.amarkin.projecteuler;

/**
 * Created by amarkin on 1/9/2016.
 */
public class Problem24 {

    private static int[] digits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int last = digits.length - 1;

    public static void main(String[] args) {
        // tests
//        assertArrayEquals(print(digits),                  new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9, 8});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 6, 8, 7, 9});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9, 7});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 6, 9, 7, 8});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 6, 9, 8, 7});
//
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 6, 8, 9});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 6, 9, 8});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 8, 6, 9});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9, 6});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 9, 6, 8});
//        assertArrayEquals(print(nextPermutation(digits)), new int[]{0, 1, 2, 3, 4, 5, 7, 9, 8, 6});

        for (int i = 1; i < 1_000_000; i++) {
            nextPermutation(digits);
        }
        print(digits);
    }

    private static int[] nextPermutation(int[] input) {
        for (int i = last; i > 0; i--) {
            int current = input[i];
            if (current > input[i - 1]) {
                int nextMaxIndex = indexOfNextMax(input, i - 1);
                swap(input, i - 1, nextMaxIndex);
                reverse(input, i, last);
                break;
            }
        }
        return input;
    }

    // from, to - inclusive
    private static void reverse(int[] input, int from, int to) {
        for (int i = from, j = to; i <= (to + from) / 2; i++, j--) {
            swap(input, j, i);
        }
    }

    private static void swap(int[] input, int i, int j) {
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
    }

    private static int indexOfNextMax(int[] input, int index) {
        int elem = input[index];
        int newElem = Integer.MAX_VALUE;
        int newIndex = -1;
        for (int i = last; i >= index + 1; i--) {
            int candidate = input[i];
            if (newElem > candidate && elem < candidate) {
                newIndex = i;
                newElem = candidate;
            }
        }
        if (newIndex == -1) {
            throw new IllegalStateException();
        } else {
            return newIndex;
        }
    }

    private static int[] print(int[] a) {
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        return a;
    }

}
