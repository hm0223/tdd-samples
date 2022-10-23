package com.hm.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * SulfurasTest. 萨弗拉斯
 *
 * @author huwenfeng
 * @since 1.0.0
 */
class SulfurasTest {

    @Test
    void should_quality_and_saleIn_same_value_when_update_given_in_sale_and_quality() {
        long oldQuality = 10;
        int oldSaleIn = 10;
        Goods goods = new Goods("Sulfuras", oldQuality, oldSaleIn);
        goods.updateByDay();
        assertThat(goods.getQuality()).isEqualTo(oldQuality);
        assertThat(goods.getSaleIn()).isEqualTo(oldSaleIn);
    }

}
