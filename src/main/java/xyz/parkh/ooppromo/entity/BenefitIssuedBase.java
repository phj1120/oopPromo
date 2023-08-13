package xyz.parkh.ooppromo.entity;

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
}
