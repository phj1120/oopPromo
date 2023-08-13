package xyz.parkh.ooppromo.repository;

import xyz.parkh.ooppromo.entity.GoodsBase;

public class GoodsRepository implements Repository<GoodsBase> {
    @Override
    public void save(GoodsBase goodsBase) {
        DataContext.getInstance().goodsBase.put(goodsBase.getGoodsNo(), goodsBase);
    }

    @Override
    public GoodsBase findById(Long id) {
        return DataContext.getInstance().goodsBase.get(id);
    }
}

