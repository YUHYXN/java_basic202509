package oopTest.cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10세 이하, 1000원 할인");
        } else {
            System.out.println("총 할인 금액: " + discount + "원");

        }


        // 중복 할인이 가능하기 때문에 독립 된 if문을 작성한다.
        // 위처럼 else if 문으로 작성하면 둘 중 하나만 수행됨


    }
}
