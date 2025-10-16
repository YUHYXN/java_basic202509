package oopTest.cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // 삼항 연산자를 활용 더 큰 숫자 찾기

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;  // a가 b보다 크면 a를, 아니면 b를 max에 저장
        System.out.println("더 큰 숫자는? " + max + "입니다."); // 출력

    }
}
