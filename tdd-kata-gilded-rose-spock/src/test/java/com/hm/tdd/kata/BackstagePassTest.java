
package com.hm.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * BackstagePassTest. 后台门票
 *
 * @author huwenfeng
 * @since 1.0.0
 */
class BackstagePassTest {

    @Test
    void should_quality_increase_by_1_and_saleIn_decrease_by_1_when_update_given_saleIn_more_than_10_and_quality_less_50() {
        long oldQuality = 10;
        int oldSaleIn = 15;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality + 1);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_50_and_saleIn_decrease_by_1_when_update_given_saleIn_more_than_10_and_quality_is_50() {
        long oldQuality = 50;
        int oldSaleIn = 15;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(50);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_increase_by_2_and_saleIn_decrease_by_1_when_update_given_saleIn_between_5_and_10_and_quality_is_less_49() {
        long oldQuality = 48;
        int oldSaleIn = 8;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality + 2);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_50_and_saleIn_decrease_by_1_when_update_given_saleIn_and_quality_is_49_or_50() {
        long oldQuality = 50;
        int oldSaleIn = 8;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(50);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_increase_by_3_and_saleIn_decrease_by_1_when_update_given_saleIn_between_1_and_5_quality_is_0_47() {
        long oldQuality = 47;
        int oldSaleIn = 3;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(50);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_50_and_saleIn_decrease_by_1_when_update_given_saleIn_between_1_and_5_quality_is_50() {
        long oldQuality = 50;
        int oldSaleIn = 3;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(50);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn - 1);
    }

    @Test
    void should_quality_is_0_and_saleIn_is_0_when_update_given_out_sale_quality_is_between_0_and_50() {
        long oldQuality = 50;
        int oldSaleIn = 0;
        Goods goods = new Goods("BackstagePass", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isZero();
        assertThat(goods.getSaleIn()).isZero();
    }
}
