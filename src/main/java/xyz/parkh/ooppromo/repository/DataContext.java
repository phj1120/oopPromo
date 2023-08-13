package xyz.parkh.ooppromo.repository;

import org.springframework.stereotype.Component;
import xyz.parkh.ooppromo.entity.BenefitBase;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;
import xyz.parkh.ooppromo.entity.GoodsBase;
import xyz.parkh.ooppromo.entity.MemberBase;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataContext {
    Map<Long, BenefitBase> benefitBase = new HashMap<>();
    Map<Long, BenefitIssuedBase> benefitIssuedBase = new HashMap<>();
    Map<Long, GoodsBase> goodsBase = new HashMap<>();
    Map<Long, MemberBase> memberBase = new HashMap<>();
}
