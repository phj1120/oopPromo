package xyz.parkh.ooppromo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import xyz.parkh.ooppromo.entity.GoodsBase;
import xyz.parkh.ooppromo.entity.MemberBase;

@Component
@RequiredArgsConstructor
public class MemberRepository implements Repository<MemberBase> {
    private final DataContext dataContext;

    @Override
    public void save(MemberBase memberBase) {
        dataContext.memberBase.put(memberBase.getMemberNo(), memberBase);
    }

    @Override
    public MemberBase findById(Long id) {
        return dataContext.memberBase.get(id);
    }
}

