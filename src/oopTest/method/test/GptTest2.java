package oopTest.method.test;

public class GptTest2 { // 클래스 시작

    public static void main(String[] args) {    // main 메서드 안에 선언하면 안 됨 문법적 오류
        String result = checkEvenOdd(6);
        System.out.println(result);
    }

    /*
    * return의 특징
    * 1. return 뒤에는 값이 나와야한다. (void 메서드 제외)
    * 2. return은 메서드를 종료시키는 역할을 한다.
    * 3. 반환 값의 자료형(type)은 메서드 선언의 타입과 같아야한다. int, String, boolean 등
    * ㄴ 예: public static int methodName() { return 10; }
    * ㄴ 예: public static String methodName() { return "Hello"; }
    * ㄴ 예: public static boolean methodName() { return true; }
    * 4. 반환 값이 없는 메서드는 void로 선언한다.
    * */

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0 ){
           return "Even";
        }else {
            return "Odd";
        }


    }
}
