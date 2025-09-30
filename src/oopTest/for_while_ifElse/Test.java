package oopTest.for_while_ifElse;

public class Test {
    public static void main(String[] args) {


        // i=6 → 조건식(6<=5) 거짓 → 반복 종료


        // *** while 문
        // while문 기본 구조: while(조건식) { 반복 실행할 코드 }
        int i = 1; // 초기값
        while (i <= 5) { // 조건식
            System.out.println("현재 i의 값: " + i);
            i++; // 증감식 (없으면 무한 루프)
        }
        // 실행 흐름
        // i=1 → 조건식(1<=5) 참 → 실행 → i=2
        // i=2 → 조건식(2<=5) 참 → 실행 → i=3
        // ...
        // i=6 → 조건식(6<=5) 거짓 → 반복 종료

        // *** do~while 문
        // do-while문: 무조건 한 번은 실행되고 나서 조건 검사

        i = 1;

        do {
            System.out.println("현재 i의 값: " + i);
            i++;
        } while (i <= 5);

        // 실행 흐름
        // i=1 → 실행 먼저 함 → 조건식(2<=5) 검사 → 참 → 반복
        // ...
        // i=6 → 실행 후 조건식(6<=5) 거짓 → 반복 종료








    }
}
