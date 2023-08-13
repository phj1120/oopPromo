package xyz.parkh.ooppromo.entity;

import lombok.Builder;
import lombok.Getter;
import xyz.parkh.ooppromo.repository.MemberRepository;

@Getter
public class MemberBase {
    private long memberNo;
    private String memberNm;

    // 내부 시퀀스
    private static long seq = 1l;
    private static long getNextSeq(){
        return seq++;
    }
    @Builder
    private MemberBase(String memberNm) {
        this.memberNo = MemberBase.getNextSeq();
        this.memberNm = memberNm;
    }
}
