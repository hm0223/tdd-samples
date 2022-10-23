package com.hm.tdd.kata;

/**
 * Goods.
 *
 * @author huwenfeng
 * @since 1,0,0
 */
public class Goods {
    private final String name;
    private long quality;
    private int saleIn;

    public Goods(String name, long quality, int saleIn) {
        this.name = name;
        this.quality = quality;
        this.saleIn = saleIn;
    }

    public void updateByDay() {
        if ("Sulfuras".equals(name)) {
            return;
        }
        if ("BackstagePass".equals(name)) {
            updateBackstagePassGods();
            return;
        }
        if ("AgedBrie".equals(name)) {
            updateAgedBrieGoods();
            return;
        }
        updateRegularGoods();
    }

    private void updateBackstagePassGods() {
        if (saleIn < 1) {
            quality = 0;
            return;
        }
        if (saleIn > 10) {
            increaseQuality();
        }
        if (saleIn > 5 && saleIn <= 10) {
            increaseQuality();
            increaseQuality();
        }
        if (saleIn > 0 && saleIn <= 5) {
            increaseQuality();
            increaseQuality();
            increaseQuality();
        }
        decreaseSaleIn();
    }

    private void updateAgedBrieGoods() {
        increaseQuality();
        if (saleIn < 1) {
            increaseQuality();
        }
        decreaseSaleIn();
    }

    private void updateRegularGoods() {
        decreaseQuality();
        decreaseSaleIn();
        if (saleIn < 1) {
            decreaseQuality();
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private void decreaseSaleIn() {
        if (saleIn > 0) {
            saleIn = saleIn - 1;
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public long getQuality() {
        return this.quality;
    }

    public int getSaleIn() {
        return this.saleIn;
    }
}
