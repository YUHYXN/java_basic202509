package oopTest.operator;

public class Operator3 {

    public static void main(String[] args) {

        // 연산 우선순위

        int sum1 = 1 + 2 * 3; // 1 + 6 = 7
        int sum2 = (1 + 2) * 3; // 3 * 3 = 9
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        int result = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3) 막히면 괄호를 쳐라
        System.out.println("result = " + result);

        /*
        2 * 2 + 3 * 3
        (2 * 2) + (3 * 3) //곱셈이 우선순위가 높다
        4 + 9
        13
         */


    }
}
