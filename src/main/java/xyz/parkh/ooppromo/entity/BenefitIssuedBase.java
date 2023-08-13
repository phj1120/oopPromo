package xyz.parkh.ooppromo.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BenefitIssuedBase {
    private long couponIssueNo;
    private LocalDateTime applyStart;
    private LocalDateTime applyEnd;
    private boolean useYn;
    private MemberBase memberBase;
    private BenefitBase benefitBase;

    // 내부 시퀀스
    private static long seq = 1l;
    private static long getNextSeq(){
        return seq++;
    }
    @Builder
    private BenefitIssuedBase(LocalDateTime applyStart, LocalDateTime applyEnd, boolean useYn, MemberBase memberBase, BenefitBase benefitBase) {
        this.couponIssueNo = BenefitIssuedBase.getNextSeq();
        this.applyStart = applyStart;
        this.applyEnd = applyEnd;
        this.useYn = useYn;
        this.memberBase = memberBase;
        this.benefitBase = benefitBase;
    }
}
