package xyz.parkh.ooppromo.entity;

import java.time.LocalDateTime;

public class BenefitIssuedBase {
    long couponIssueNo;
    LocalDateTime applyStart;
    LocalDateTime applyEnd;
    boolean useYn;
    MemberBase memberBase;
    BenefitBase benefitBase;
}
