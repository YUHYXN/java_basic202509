package Sprint.Ms1;

public class BasicOperations {
    public static void main(String[] args) {
        // 두 정수 a=15, b=4에 대해 다양한 연산(덧셈, 뺄셈, 곱셈, 나눗셈, 나머지)의 결과를 출력하는 프로그램을 작성하세요.
        // 출력예시
        // 덧셈: 19
        // 뺄셈: 11
        // 곱셈: 60
        // 나눗셈(정수): 3
        // 나눗셈(실수): 3.75
        // 나머지: 3

        int a = 15;
        int b = 4;

        System.out.println("덧셈: " + (a + b));
        System.out.println("뺄셈: " + (a - b));
        System.out.println("곱셈: " + (a * b));
        System.out.println("나눗셈(정수): " + (a / b));
        System.out.println("나눗셈(실수): " + ((double)a / b)); // 실수 나눗셈을 위해 a를 double로 캐스팅
        System.out.println("나머지: " + (a % b));

        // 실습 해설
        // 정수끼리 나눗셈은 정수 결과만 나옵니다 (15/4 = 3)
        //실수 나눗셈을 원한다면 형변환이 필요합니다
        //나머지 연산자 %는 나눈 후 남은 값을 구합니다
        //괄호로 연산 우선순위를 명확히 했습니다
    }
}
