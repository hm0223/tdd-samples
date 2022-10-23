package com.hm.tdd.fizz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * FizzBuzzWhizzTest.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
class FizzBuzzWhizzTest {

    @Test
    void should_report_fizz_when_reporting_give_contains_3() {
        assertThat(FizzBuzzWhizz.report(13)).isEqualTo("Fizz");
        assertThat(FizzBuzzWhizz.report(23)).isEqualTo("Fizz");
        assertThat(FizzBuzzWhizz.report(30)).isEqualTo("Fizz");
    }

    @Test
    void should_report_fizz_when_reporting_give_not_contains_3_and_is_mod_3() {
        assertThat(FizzBuzzWhizz.report(9)).isEqualTo("Fizz");
        assertThat(FizzBuzzWhizz.report(24)).isEqualTo("Fizz");
        assertThat(FizzBuzzWhizz.report(27)).isEqualTo("Fizz");
    }

    @Test
    void should_report_buzz_when_reporting_give_not_contains_3_and_is_mod_5() {
        assertThat(FizzBuzzWhizz.report(10)).isEqualTo("Buzz");
        assertThat(FizzBuzzWhizz.report(20)).isEqualTo("Buzz");
        assertThat(FizzBuzzWhizz.report(25)).isEqualTo("Buzz");
    }

    @Test
    void should_report_whizz_when_reporting_give_not_contains_3_and_is_mod_5() {
        assertThat(FizzBuzzWhizz.report(7)).isEqualTo("Whizz");
        assertThat(FizzBuzzWhizz.report(14)).isEqualTo("Whizz");
        assertThat(FizzBuzzWhizz.report(28)).isEqualTo("Whizz");
    }

    @Test
    void should_report_fizz_buzz_when_reporting_give_not_contains_3_and_is_mod_3_and_5() {
        assertThat(FizzBuzzWhizz.report(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzzWhizz.report(45)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzzWhizz.report(60)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_report_fizz_whizz_when_reporting_give_not_contains_3_and_is_mod_3_and_7() {
        assertThat(FizzBuzzWhizz.report(21)).isEqualTo("FizzWhizz");
        assertThat(FizzBuzzWhizz.report(42)).isEqualTo("FizzWhizz");
        assertThat(FizzBuzzWhizz.report(84)).isEqualTo("FizzWhizz");
    }

    @Test
    void should_report_buzz_whizz_when_reporting_give_not_contains_3_and_is_mod_5_and_7() {
        assertThat(FizzBuzzWhizz.report(70)).isEqualTo("BuzzWhizz");
        assertThat(FizzBuzzWhizz.report(140)).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_report_fizz_buzz_whizz_when_reporting_give_not_contains_3_and_is_mod_3_and_5_and_7() {
        assertThat(FizzBuzzWhizz.report(105)).isEqualTo("FizzBuzzWhizz");
        assertThat(FizzBuzzWhizz.report(210)).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    void should_report_self_when_reporting_give_not_contains_3_and_is_not_mod_3_or_5_or_7() {
        assertThat(FizzBuzzWhizz.report(1)).isEqualTo("1");
        assertThat(FizzBuzzWhizz.report(4)).isEqualTo("4");
        assertThat(FizzBuzzWhizz.report(8)).isEqualTo("8");
    }
}
