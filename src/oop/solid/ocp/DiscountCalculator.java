package oop.solid.ocp;

public class DiscountCalculator {

    // 아래처럼 하면 중간에 하나 실수하면 그 아래 조건식들은 싹다 오류가 발생한다.
//    public long calculateDiscount(String customerGrade, long price) {
//        long discountPrice = 0;
        // 고객등급 및 혜택이 변경될 때마다 아래처럼 수정하거나 추가해야하는 번거로움이 있고 위험이 있다.
        // OCP 원칙에 위배됨.
        // if-else 문을 제거하고, 고객등급별로 클래스를 분리하여 해결할 수 있다.
//        if ("SILVER".equals(customerGrade)) {
//            discountPrice = price * 5 / 100; // 실버 등급 5% 할인
//        }else if ("GOLD".equals(customerGrade)) {
//            discountPrice = price * 10 / 100; // 골드 등급 10% 할인
//        }else if ("VIP".equals(customerGrade)) {
//            discountPrice = price * 20 / 100; // VIP 등급 20% 할인
//        }else if ("PLATINUM".equals(customerGrade)) {
//            discountPrice = price * 30 / 100; // PLATINUM 등급 30% 할인
//        }
//        return discountPrice;
//    }

    // 인터페이스에 담아서 클래스로 나눈 어쩌고 그거 사용
    public long calculateDiscount(DiscountPolicy policy, long price) {
        // 계산기는 그저 전달 받은 정책에 따라 가격을 계산만 한다.
        return policy.getDiscountPrice(price);

        // 인터페이스로 했기에 다형성이 적용 됨

    }


}
