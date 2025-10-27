package oopTest.scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        // a와 b의 값을 서로 교환하는 코드를 작성하세요.
        // 시작: 코드를 작성하세요
        temp = a;    // temp에 a의 값을 저장 이상태에서 바꾸기 시작해야함
        a = b;       // a에 b의 값을 저장
        b = temp;    // b에 temp의 값을 저장


        // 종료: 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
