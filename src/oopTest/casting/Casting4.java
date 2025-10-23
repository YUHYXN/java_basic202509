package oopTest.casting;

public class Casting4 {
    public static void main(String[] args) {

        int div1 = 3 / 2; // 1 (int라서 1이다.)
        System.out.println("div1: " + div1);

        double div2 = 3 / 2; // 1.0 (int라서 1이다.)
        System.out.println("div2: " + div2); // 1.0 (int라서 1이다.)

        double div3 = 3.0 / 2;  // 3.0 / 2
        System.out.println("div3: " + div3); // 1.0 (int라서 1이다.)

        double div4 = (double) 3 / 2;   // 3.0 / 2
        System.out.println("div4: " + div4); // 1.5


        int a = 3;
        int b = 2;
        double result = (double) a / b; // 3.0 / 2
        System.out.println("result: " + result); // 1.5
    }

    /*
    * 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다
    * 2. 서로 다른 타입의 계산은 큰 범위로 자동 형 변환이 된다.
    *
    * */
}
