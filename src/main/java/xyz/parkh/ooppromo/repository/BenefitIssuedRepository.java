package xyz.parkh.ooppromo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.parkh.ooppromo.entity.BenefitBase;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;

@Component
@RequiredArgsConstructor
public class BenefitIssuedRepository implements Repository<BenefitIssuedBase> {
    private final DataContext dataContext;

    @Override
    public void save(BenefitIssuedBase benefitIssuedBase) {
        dataContext.benefitIssuedBase.put(benefitIssuedBase.getCouponIssueNo(), benefitIssuedBase);
    }

    @Override
    public BenefitIssuedBase findById(Long id) {
        return dataContext.benefitIssuedBase.get(id);
    }
}
