package oopTest.operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("덧셈: " + sum);   // 출력 7

        // 뺄셈
        int diff = a - b;
        System.out.println("뺄셈: " + diff);

        // 곱셈
        int prod = a * b;
        System.out.println("곱셈: " + prod);

        // 나눗셈
        int quot = a / b;
        System.out.println("나눗셈: " + quot);

        // 나머지
        int rem = a % b;
        System.out.println("나머지: " + rem);
    }
}
