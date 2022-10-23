package com.hm.tdd;

/**
 * FiberCalculator.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
public class FiberCalculator {
    public static long calculate(int index) {
        if (index < 1 || index > 50) {
            throw new IllegalArgumentException();
        }

        if (index == 1 || index == 2) {
            return 1;
        }

        long first = 1;
        long second = 1;
        long temp;
        for (int i = 3 ; i <= index ; i++) {
            temp = first;
            first = second;
            second = temp + first;
        }
        return second;
    }
}
