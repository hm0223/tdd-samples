package com.tdd.spock

import spock.lang.Specification
import spock.lang.Unroll


class FizzBuzzTest extends Specification {

    @Unroll
    def 'Fizz Buzz Whizz Test'() {
        expect:
        output == FizzBuzzSupport.report(input)

        where:
        input || output
        3     || 'Fizz'
        5     || 'Buzz'
        7     || 'Whizz'

    }

}