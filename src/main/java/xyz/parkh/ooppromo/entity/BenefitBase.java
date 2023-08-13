package xyz.parkh.ooppromo.entity;

import lombok.Builder;
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

    // 내부 시퀀스
    private static long seq = 1l;
    private static long getNextSeq(){
        return seq++;
    }
    @Builder
    private BenefitBase(String benefitNm, String benefitTypeCd, String fixRateCd, long fixRateAmt, long limitDiscountAmt, int discountDays, List<GoodsBase> applyGoodsList) {
        this.benefitNo = BenefitBase.getNextSeq();
        this.benefitNm = benefitNm;
        this.benefitTypeCd = benefitTypeCd;
        this.fixRateCd = fixRateCd;
        this.fixRateAmt = fixRateAmt;
        this.limitDiscountAmt = limitDiscountAmt;
        this.discountDays = discountDays;
        this.applyGoodsList = applyGoodsList;
    }
}
