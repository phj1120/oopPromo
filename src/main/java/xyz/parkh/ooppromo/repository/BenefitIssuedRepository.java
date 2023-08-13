package xyz.parkh.ooppromo.repository;

import xyz.parkh.ooppromo.entity.BenefitIssuedBase;

public class BenefitIssuedRepository implements Repository<BenefitIssuedBase> {

    @Override
    public void save(BenefitIssuedBase benefitIssuedBase) {
        DataContext.getInstance().benefitIssuedBase.put(benefitIssuedBase.getCouponIssueNo(), benefitIssuedBase);
    }

    @Override
    public BenefitIssuedBase findById(Long id) {
        return DataContext.getInstance().getInstance().benefitIssuedBase.get(id);
    }
}
