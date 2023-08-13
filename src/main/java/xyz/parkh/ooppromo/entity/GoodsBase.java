package xyz.parkh.ooppromo.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class GoodsBase {
    private long goodsNo;
    private String goodsNm;
    private long salePrc;

    // 내부 시퀀스
    private static long seq = 1l;
    private static long getNextSeq(){
        return seq++;
    }
    @Builder
    private GoodsBase(String goodsNm, long salePrc) {
        this.goodsNo = GoodsBase.getNextSeq();
        this.goodsNm = goodsNm;
        this.salePrc = salePrc;
    }
}
