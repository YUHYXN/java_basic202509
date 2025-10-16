package oopTest.loop;

public class For2 {
    public static void main(String[] args) {

        int sum = 0;
        int endNum = 3;

        /*
        * for (초기식; 조건식; 증감식) {
        *  반복 실행할 코드}
        * 초기식: 반복문이 시작될 때 단 한 번만 실행되는 부분입니다. 보통 반복 변수의 초기값을 설정합니다.
        * 조건식: 반복문이 계속 실행될지 여부를 결정하는 부분입니다. 이 조건이 참(true)인 동안 반복문이 실행됩니다.
        * 증감식: 반복 변수의 값을 변경하는 부분입니다. 보통 반복 변수를 증가시키거나 감소시키는 데 사용됩니다.
        * 
        * */

        // 1+2+3 = 6
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
