package oopTest.cond;

public class Switch4 {
    public static void main(String[] args) {

        // 자바 14버전 이상에서 새로운 Switch 문법이 추가됨

        int grade = 2;

        int coupon = switch (grade){
            // 결과 값이 바로 변수에 대입이 되어서 깔끔하게 사용 가능.
            // 기존 스위치문과는 -> 를 사용한다는 것과 break 문이 필요 없다는 것.
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰: " + coupon + "원");
    }
}
