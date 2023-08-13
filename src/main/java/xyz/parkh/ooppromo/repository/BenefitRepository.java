package xyz.parkh.ooppromo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.parkh.ooppromo.entity.BenefitBase;

@Component
@RequiredArgsConstructor
public class BenefitRepository implements Repository<BenefitBase> {
    private final DataContext dataContext;

    @Override
    public void save(BenefitBase benefitBase) {
        dataContext.benefitBase.put(benefitBase.getBenefitNo(), benefitBase);
    }

    @Override
    public BenefitBase findById(Long id) {
        return dataContext.benefitBase.get(id);
    }
}
