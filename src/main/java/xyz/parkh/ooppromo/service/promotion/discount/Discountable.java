package xyz.parkh.ooppromo.service.promotion.discount;

import xyz.parkh.ooppromo.entity.BenefitBase;

public interface Discountable {
    void calculate();
    void discount();

    BenefitBase getBenefitBase();
}
