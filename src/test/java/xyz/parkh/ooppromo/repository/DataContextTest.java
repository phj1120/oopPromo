package xyz.parkh.ooppromo.repository;

import org.junit.jupiter.api.Test;
import xyz.parkh.ooppromo.entity.BenefitBase;
import xyz.parkh.ooppromo.entity.BenefitIssuedBase;
import xyz.parkh.ooppromo.entity.GoodsBase;
import xyz.parkh.ooppromo.entity.MemberBase;

import static org.assertj.core.api.Assertions.assertThat;

class DataContextTest {
    BenefitIssuedRepository benefitIssuedRepository;
    BenefitRepository benefitRepository;
    GoodsRepository goodsRepository;
    MemberRepository memberRepository;

    public DataContextTest() {
        this.benefitIssuedRepository = new BenefitIssuedRepository();
        this.benefitRepository = new BenefitRepository();
        this.goodsRepository = new GoodsRepository();
        this.memberRepository = new MemberRepository();
    }

    @Test
    void makeEntityByDifferenceSequence() {
        BenefitBase bb1 = BenefitBase.builder().build();
        BenefitBase bb2 = BenefitBase.builder().build();
        assertThat(bb1.getBenefitNo()).isNotEqualTo(bb2.getBenefitNo());

        BenefitIssuedBase bib1 = BenefitIssuedBase.builder().build();
        BenefitIssuedBase bib2 = BenefitIssuedBase.builder().build();
        assertThat(bib1.getCouponIssueNo()).isNotEqualTo(bib2.getCouponIssueNo());

        GoodsBase gb1 = GoodsBase.builder().build();
        GoodsBase gb2 = GoodsBase.builder().build();
        assertThat(gb1.getGoodsNo()).isNotEqualTo(gb2.getGoodsNo());

        MemberBase mb1 = MemberBase.builder().build();
        MemberBase mb2 = MemberBase.builder().build();
        assertThat(mb1.getMemberNo()).isNotEqualTo(mb2.getMemberNo());
    }

    @Test
    void saveAndFind() {
        BenefitBase bb = BenefitBase.builder().build();
        benefitRepository.save(bb);
        BenefitBase findBb = benefitRepository.findById(bb.getBenefitNo());
        assertThat(bb).isEqualTo(findBb);

        BenefitIssuedBase bib = BenefitIssuedBase.builder().build();
        benefitIssuedRepository.save(bib);
        BenefitIssuedBase findBib = benefitIssuedRepository.findById(bib.getCouponIssueNo());
        assertThat(bib).isEqualTo(findBib);

        GoodsBase gb = GoodsBase.builder().build();
        goodsRepository.save(gb);
        GoodsBase findGb = goodsRepository.findById(gb.getGoodsNo());
        assertThat(gb).isEqualTo(findGb);

        MemberBase mb = MemberBase.builder().build();
        memberRepository.save(mb);
        MemberBase findMb = memberRepository.findById(mb.getMemberNo());
        assertThat(mb).isEqualTo(findMb);
    }
}