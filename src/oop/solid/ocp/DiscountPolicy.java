package oop.solid.ocp;

// 할인 정책을 위한 인터페이스를 만들었다. 규칙 생성
// 할인 정책이라면 가격을 받아 할인된 금액을 알려준다
public interface DiscountPolicy {

    // 할인 가격을 계산하는 메서드 생성
    long getDiscountPrice(long price);

}
