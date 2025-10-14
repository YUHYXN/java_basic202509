package oopTest.cond;

public class Switch2 {
    public static void main(String[] args) {
        // switch 문으로 변경

        int grade = 3;

        int coupon;

        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("쿠폰 금액: " + coupon + "원");
    }
}
