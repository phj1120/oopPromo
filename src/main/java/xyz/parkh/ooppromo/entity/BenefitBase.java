package xyz.parkh.ooppromo.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BenefitBase {
    private long benefitNo;
    private String benefitNm;
    private String benefitTypeCd; // 혜택타입
    private String fixRateCd; // 할인방식: 정액/정률
    private long fixRateAmt;
    private long limitDiscountAmt; // 최대 할인 금액
    private int discountDays; // 발급일자 기준만 고려.
    private List<GoodsBase> applyGoodsList = new ArrayList<>(); // 적용대상상품
}
