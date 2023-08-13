package xyz.parkh.ooppromo.repository;

import xyz.parkh.ooppromo.entity.MemberBase;

public class MemberRepository implements Repository<MemberBase> {

    @Override
    public void save(MemberBase memberBase) {
        DataContext.getInstance().memberBase.put(memberBase.getMemberNo(), memberBase);
    }

    @Override
    public MemberBase findById(Long id) {
        return DataContext.getInstance().memberBase.get(id);
    }
}

