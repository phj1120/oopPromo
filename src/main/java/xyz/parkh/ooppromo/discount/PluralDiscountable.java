package xyz.parkh.ooppromo.discount;

import xyz.parkh.ooppromo.entity.GoodsBase;

import java.util.List;

public interface PluralDiscountable extends Discountable {
    default void calculate(){

    }
    default void discount(){

    }

    List<GoodsBase> getGoodsBaseList();

}
