package xyz.parkh.ooppromo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BenefitBase {
    String benefitNo;
    String benefitNm;
    String benefitTypeCd; // 혜택타입
    String fixRateCd; // 할인방식: 정액/정률
    long fixRateAmt;
    long limitDiscountAmt; // 최대 할인 금액
    int discountDays; // 발급일자 기준만 고려.
    List<GoodsBase> applyGoodsList = new ArrayList<>(); // 적용대상상품
}
