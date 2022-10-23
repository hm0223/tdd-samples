package com.tdd.spock;

/**
 * FiberCalculator.
 *
 * @author huwenfeng
 */
public class FiberCalculator {
    public static long calculate(int index) {
        if (index == 1 || index == 2) {
            return 1L;
        }

        long first = 1L;
        long second = 1L;
        long temp;

        for (int i = 3 ; i < index ; i++) {
            temp = first;
            first = second;
            second = temp + first;
        }
        return second;
    }
}
