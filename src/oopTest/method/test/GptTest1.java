package oopTest.method.test;

public class GptTest1 { // 클래스 시작
    public static void main(String[] args) {    // main 메서드 안에 선언하면 안 됨 문법적 오류
        checkEvenOdd(6);
//        checkEvenOdd(10);
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0 ){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
