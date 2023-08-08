# 객체 지향적으로 쿠폰, 할인

## 업무
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

interface
```
issuable -> 발급
    issue()
    use()
    cncl()
discountable -> 할인
    calc()
    discount()
discountable/singularDiscountable
discountable/pluralDiscountable
accumulalbe -> 적립
    추후고려
```

field
```
degree
fixAmt
```

객체
```
UsageManager -> 사용관리
Calculator -> 할인 금액 계산
Validator -> 검증
Issuer -> 발급
```
