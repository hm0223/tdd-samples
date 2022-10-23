package com.hm.tdd.kata

import spock.lang.Specification
import spock.lang.Unroll


class KataGildedRoseSpec extends Specification {

    @Unroll
    def "#name 价值:#quality 保质期:#saleIn天 按天更新价值后 价值:#newQuality 保质期:#newSaleIn天"() {
        given: "Mock数据"

        when: "按天更新价值和保质期"
        def good = getGood(name, quality, saleIn)
        good.updateByDay()

        then: "结果校验"
        with(good) {
            good.quality == newQuality
            good.saleIn == newSaleIn
        }

        where:
        name            | quality | saleIn || newQuality  | newSaleIn
        "AgedBrie"      | 10      | 10     || quality + 1 | saleIn - 1
        "AgedBrie"      | 50      | 10     || quality     | saleIn - 1
        "AgedBrie"      | 47      | 0      || quality + 2 | saleIn
        "AgedBrie"      | 50      | 0      || quality     | saleIn
        "BackstagePass" | 10      | 15     || 11          | 14
        "BackstagePass" | 50      | 15     || 50          | 14
        "BackstagePass" | 48      | 8      || 50          | 7
        "BackstagePass" | 50      | 8      || 50          | 7
        "BackstagePass" | 47      | 3      || 50          | 2
        "BackstagePass" | 50      | 3      || 50          | 2
        "BackstagePass" | 50      | 0      || 0           | 0
        "Regular"       | 10      | 10     || 9           | 9
        "Regular"       | 0       | 10     || 0           | 9
        "Regular"       | 0       | 10     || 0           | 9
        "Regular"       | 10      | 0      || 8           | 0
        "Regular"       | 1       | 0      || 0           | 0
        "Sulfuras"      | 10      | 10     || 10          | 10

    }

    def getGood(def name, def quality, def saleIn) {
        return new Goods(name, quality, saleIn)
    }


}