package oop.solid.ocp;

// 실버 등급 정책에 기본 정책을 가져옴
public class SilverDiscountPolicy implements DiscountPolicy {
    @Override
    public long getDiscountPrice(long price) {
        return price * 5 / 100; // 실버 등급 5% 할인 (double 이면 * 0.05 하면됨)
    }
}
