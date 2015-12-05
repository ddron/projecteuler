package com.amarkin.projecteuler.problem10;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * Created by amarkin on 6/13/2015.
 */
public class Problem10 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int maxNumber = 1_999_999;
        int firstNumber = 2;

        int[] arr = getPopulatedArray(maxNumber);

        int maxElemToCheck = (int) Math.sqrt(maxNumber);
        long sum = 0;

        for (int i = firstNumber; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            //System.out.print(i + " ");
            sum += i;
            if (i > maxElemToCheck) {
                continue;
            }

            int k = i;
            for (int j = i * k; j < arr.length; j = i * (++k)) {
                arr[j] = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\n" + (end - start));
        System.out.println(sum);

    }


    private static int[] getPopulatedArray(int maxNumber) {
        int[] arr = new int[maxNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
