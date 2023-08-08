package xyz.parkh.ooppromo.discount;

import lombok.Getter;
import xyz.parkh.ooppromo.entity.BenefitBase;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;
import xyz.parkh.ooppromo.entity.GoodsBase;
import xyz.parkh.ooppromo.issue.Issuable;

@Getter
public class GoodsCoupon implements SingularDiscountable, Issuable {
    BenefitBase benefitBase;
    BenefitIssuedBase benefitIsuBase;
    GoodsBase goodsBase;

}
