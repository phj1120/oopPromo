package xyz.parkh.ooppromo.discount;

import xyz.parkh.ooppromo.entity.GoodsBase;

public interface SingularDiscountable extends Discountable {
    default void calculate(){

    }

    default void discount(){

    }

    GoodsBase getGoodsBase();
}
