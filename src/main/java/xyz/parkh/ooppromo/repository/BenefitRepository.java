package xyz.parkh.ooppromo.repository;

import xyz.parkh.ooppromo.entity.BenefitBase;

public class BenefitRepository implements Repository<BenefitBase> {

    @Override
    public void save(BenefitBase benefitBase) {
        DataContext.getInstance().benefitBase.put(benefitBase.getBenefitNo(), benefitBase);
    }

    @Override
    public BenefitBase findById(Long id) {
        return DataContext.getInstance().benefitBase.get(id);
    }
}
