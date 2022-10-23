package com.hm.tdd.fizz;

/**
 * FizzBuzzWhizz.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
public class FizzBuzzWhizz {
    public static String report(int num) {
        return reportRefactor(num);
    }

    public static String reportRefactor(int order) {
        String orderString = String.valueOf(order);
        if (orderString.contains("3")) {
            return "Fizz";
        }
        String result = "";
        if (order % 3 == 0) {
            result += "Fizz";
        }
        if (order % 5 == 0) {
            result += "Buzz";
        }
        if (order % 7 == 0) {
            result += "Whizz";
        }
        return result.isEmpty() ? orderString : result;
    }
}
