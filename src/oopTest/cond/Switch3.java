package oopTest.cond;

public class Switch3 {
    public static void main(String[] args) {
        // switch 문으로 변경

        int grade = 1;

        int coupon;

        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2: // break 문이 없으면 아래로 쭉 내려감
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
    }
}
