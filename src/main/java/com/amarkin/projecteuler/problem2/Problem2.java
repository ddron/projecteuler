package com.amarkin.projecteuler.problem2;

/**
 * Created by amarkin on 6/10/2015.
 */
public class Problem2 {

    public static void main(String[] args) {
        int sum = 0;
        int current;
        int prev = 1;
        int prevPrev = 1;
        while ((current = getNext(prev, prevPrev)) < 4000000) {
            prevPrev = prev;
            prev = current;
            if (current % 2 == 0) {
                sum += current;
            }
        }
        System.out.println(sum);
    }

    private static int getNext(int prev, int prevPrev) {
        return prev + prevPrev;
    }

}
