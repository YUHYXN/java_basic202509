package oopTest.for_while_ifElse;

public class For {
    public static void main(String[] args) {
        /*
        반복문 | for문
         */
        // *** for 문
        // for문 기본 구조: for(초기식; 조건식; 증감식) { 반복 실행할 코드 }
        // 1부터 5까지 출력하는 예제
        for (int i = 1; i <= 5; i++) {
            // i는 1부터 시작해서 5가 될 때까지 1씩 증가
            System.out.println("현재 i의 값: " + i);
        }
        // 실행 흐름
        // i=1 → 조건식(1<=5) 참 → 실행 → i=2
        // i=2 → 조건식(2<=5) 참 → 실행 → i=3
        // ...

        // Text 출력
        String text = "HELLO";
        // for문: 반복 횟수가 '문자열 길이'로 명확히 정해져 있으므로 적합
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // i번째 문자 꺼내기
            System.out.println("문자 " + (i + 1) + ": " + ch);
        }
    }
}
