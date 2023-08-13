package xyz.parkh.ooppromo.service.promotion;

import lombok.Getter;
import xyz.parkh.ooppromo.service.promotion.discount.PluralDiscountable;
import xyz.parkh.ooppromo.entity.BenefitBase;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;
import xyz.parkh.ooppromo.entity.GoodsBase;
import xyz.parkh.ooppromo.service.promotion.issue.Issuable;

import java.util.List;

@Getter
public class BasketCoupon implements PluralDiscountable, Issuable {
    BenefitBase benefitBase;
    BenefitIssuedBase benefitIsuBase;
    List<GoodsBase> goodsBaseList;
}
