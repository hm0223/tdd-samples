package com.hm.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * AgedBrieTest.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
class AgedBrieTest {

    @Test
    void should_quality_increase_by_1_and_saleIn_decrease_by_1_when_update_given_in_sale_and_quality_less_50() {
        long oldQuality = 10;
        int oldSaleIn = 10;
        Goods goods = new Goods("AgedBrie", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality + 1);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_50_and_saleIn_decrease_by_1_when_update_given_in_sale_and_quality_is_50() {
        long oldQuality = 50;
        int oldSaleIn = 10;
        Goods goods = new Goods("AgedBrie", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_50_and_saleIn_is_0_when_update_given_in_sale_and_quality_between_0_and_48() {
        long oldQuality = 47;
        int oldSaleIn = 0;
        Goods goods = new Goods("AgedBrie", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality + 2);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn);
    }

    @Test
    void should_quality_is_50_and_saleIn_is_0_when_update_given_in_sale_and_quality_between_more_than_48() {
        long oldQuality = 50;
        int oldSaleIn = 0;
        Goods goods = new Goods("AgedBrie", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(50);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn);
    }
}
