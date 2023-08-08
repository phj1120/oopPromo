# 객체 지향적으로 쿠폰, 할인

## 업무

배송쿠폰, 마일리지 적립 프로모션은 제외하고,

사용 시점이 같은 쿠폰과 할인 프로모션만 다룸.

```
혜택 -> 계산하다.
    쿠폰 -> 발급하다, 사용하다, 사용취소하다. 
        상품쿠폰
            2차 단건
            정액/정률
        중복쿠폰
            3차 단건
            정액/정률
        장바구니쿠폰  
            2차 다건
            정액/정률
    프로모션
        상품즉시할인
            2차 단건
            정률
        임직원할인
            2차 단건
            -> 3차 쿠폰 적용 불가능
            정률
```

혜택이 쿠폰과 프로모션으로 갈리는 것 -> Class

각 쿠폰 별 특수한 비즈니스 로직을 담을 수 있어야함

적용 대상 범위(단건, 다건), 할인 적용 방식(정액/정률) 로 갈리는 것 -> 전략 패턴

차수 -> 공통 코드

/ooppromo/service -> 쿠폰 사용에 대한 로직이 담겨 있어, 전체적인 흐름제어

/ooppromo/calculate/calculateManager -> 할인 금액 계산

/ooppromo/dto
    - (I) discountable
/ooppromo/dto/coupon
    - (I) issuable
/ooppromo/dto/promotion/
/ooppromo/dto/promotion/

/ooppromo/strategy
/ooppromo/strategy/coverage -> 적용범위
/ooppromo/strategy/coverage/singular -> 단건
/ooppromo/strategy/coverage/plural -> 다건
/ooppromo/strategy/discounttype -> 할인방식
/ooppromo/strategy/discounttype/rate -> 정률
/ooppromo/strategy/discounttype/fixed -> 정액

