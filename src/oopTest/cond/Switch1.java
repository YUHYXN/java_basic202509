package oopTest.cond;

public class Switch1 {
    public static void main(String[] args) {

        //스위치문은 if문을 좀더 편리하게 사용할 수 있지만,
        //if문은 비교 연산자를 사용할 수 있지만, 스위치문은 값이 같은지 단순하게 비교만 가능하다

        int grade = 2;

        int coupon;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("쿠폰 금액: " + coupon + "원");
    }


}
