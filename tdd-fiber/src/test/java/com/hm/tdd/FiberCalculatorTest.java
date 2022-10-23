package com.hm.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * FiberCalculatorTest.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
class FiberCalculatorTest {

    @Test
    void should_throw_exception_when_give_less_1() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(-1));
    }

    @Test
    void should_return_1_when_give_1_or_2() {
        assertThat(FiberCalculator.calculate(1)).isEqualTo(1);
        assertThat(FiberCalculator.calculate(2)).isEqualTo(1);
    }

    @Test
    void should_return_num_when_give_between_3_and_49() {
        assertThat(FiberCalculator.calculate(3)).isEqualTo(2);
        assertThat(FiberCalculator.calculate(5)).isEqualTo(5);
        assertThat(FiberCalculator.calculate(7)).isEqualTo(13);
        assertThat(FiberCalculator.calculate(10)).isEqualTo(55);
    }

    @Test
    void should_return_12586269025L_when_give_50() {
        assertThat(FiberCalculator.calculate(50)).isEqualTo(12586269025L);
    }

    @Test
    void should_throw_exception_when_give_gt_50() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(51));
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(100));
    }
}
