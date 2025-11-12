package oopTest.method.test;

public class GptTest2 { // 클래스 시작

    public static void main(String[] args) {    // main 메서드 안에 선언하면 안 됨 문법적 오류
        String result = checkEvenOdd(6);
        System.out.println(result);
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0 ){
           return "Even";
        }else {
            return "Odd";
        }


    }
}
