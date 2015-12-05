package com.amarkin.projecteuler.problem14;

/**
 * Created by amarkin on 6/27/2015.
 */
public class Problem14 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long maxLength = 0;
        int maxNum = 0;
        for (int i = 1; i < 1_000_000; i++) {
            long l = getSeqLength(i);
            if (l > maxLength) {
                maxLength = l;
                maxNum = i;
            }
            //System.out.println(i + ": " + l + "(maxLength=" + maxLength + ")");
        }
        System.out.println("Max length: " + maxLength + " for starting number=" + maxNum);

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start));
    }

    private static long getSeqLength(long i) {
        long l = 1;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = 3 * i + 1;
            }
            l++;
        }
        return l;
    }

}
