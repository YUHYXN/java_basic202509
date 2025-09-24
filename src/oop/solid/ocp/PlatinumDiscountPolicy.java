package oop.solid.ocp;

// 새 등급 정책이 추가되어도 기존 소스에는 전혀 수정이 없다.
public class PlatinumDiscountPolicy implements DiscountPolicy{
    @Override
    public long getDiscountPrice(long price) {
        return price * 30 / 100; // 플래티넘 등급 30% 할인
    }
}
