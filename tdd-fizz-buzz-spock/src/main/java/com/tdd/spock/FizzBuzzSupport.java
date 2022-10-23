package com.tdd.spock;

/**
 * FizzBuzzSupport.
 *
 * @author huwenfeng
 */
public class FizzBuzzSupport {
    public static String report(int reportNum) {
        if (String.valueOf(reportNum).contains("3")) {
            return "Fizz";
        }

        if (reportNum % 5 == 0) {
            return "Buzz";
        }

        if (reportNum % 7 == 0) {
            return "Whizz";
        }

        return null;
    }
}
