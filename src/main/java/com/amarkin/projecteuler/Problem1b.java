package com.amarkin.projecteuler;

/**
 * Created by amarkin on 5/24/2015.
 */
public class Problem1b {

    public static void main(String[] args) {
        int maxNumber = 1000;

        int max3seqNumber = getMaxSeqNumber(maxNumber - 1, 3);
        int max5seqNumber = getMaxSeqNumber(maxNumber - 1, 5);
        int max15seqNumber = getMaxSeqNumber(maxNumber - 1, 15);

        System.out.println(getArithmeticProgrSum(max3seqNumber, 3)
                + getArithmeticProgrSum(max5seqNumber, 5)
                - getArithmeticProgrSum(max15seqNumber, 15));
    }

    private static int getMaxSeqNumber(int maxNumber, int seqStep) {
        return (maxNumber / seqStep) * seqStep;
    }

    private static int getArithmeticProgrSum(int last, int step) {
        return (step + last) * (last / step) / 2;
    }

}
