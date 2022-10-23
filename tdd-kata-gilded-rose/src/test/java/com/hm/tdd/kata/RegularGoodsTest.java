package com.hm.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * GoodsTest.
 *
 * @author huwenfeng
 * @since 1.0.0
 */
class RegularGoodsTest {


    @Test
    void should_quality_and_saleIn_decrease_by_1_when_update_given_in_sale_and_quality_between_1_and_50() {
        long oldQuality = 10;
        int saleIn = 10;
        Goods goods = new Goods("Regular", oldQuality, saleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality - 1);
        assertThat(goods.getSaleIn()).isEqualTo(saleIn - 1);
    }

    @Test
    void should_quality_is_0_saleIn_decrease_by_1_when_update_given_in_sale_and_quality_less_1() {
        long oldQuality = 0;
        int saleIn = 10;
        Goods goods = new Goods("Regular", oldQuality, saleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isZero();
        assertThat(goods.getSaleIn()).isEqualTo(saleIn - 1);
    }

    @Test
    void should_quality_decrease_by_2_when_update_given_out_sale_and_quality_between_2_and_50() {
        int saleIn = 0;
        long oldQuality = 10;
        Goods goods = new Goods("Regular", oldQuality, saleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality - 2);
        assertThat(goods.getSaleIn()).isZero();
    }

    @Test
    void should_quality_decrease_by_2_when_update_given_out_sale_and_quality_is_1() {
        int saleIn = 0;
        long oldQuality = 1;
        Goods goods = new Goods("Regular", oldQuality, saleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isZero();
        assertThat(goods.getSaleIn()).isZero();
    }
}
