package xyz.parkh.ooppromo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;
import xyz.parkh.ooppromo.entity.GoodsBase;

@Component
@RequiredArgsConstructor
public class GoodsRepository implements Repository<GoodsBase> {
    private final DataContext dataContext;

    @Override
    public void save(GoodsBase goodsBase) {
        dataContext.goodsBase.put(goodsBase.getGoodsNo(), goodsBase);
    }

    @Override
    public GoodsBase findById(Long id) {
        return dataContext.goodsBase.get(id);
    }
}

