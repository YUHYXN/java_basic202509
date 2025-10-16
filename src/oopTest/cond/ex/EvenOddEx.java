package oopTest.cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {

        //삼항 연산자로 짝수, 홀수 판별하기

        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);

    }
}
