package oopTest.array;

public class Array1Ref3 {

    public static void main(String[] args) {

        int[] students; // 배열 변수 선언
        students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화

        // 배열 값 사용 // 배열 리펙토링
        for (int i = 0; i < 5; i++) {   // i = 0번부터고, i는 5보다 작을때까지 1씩 증가한다.
            // (i + 1) 괄호를 지우면 안됨, 연산자 우선순위 때문에  문자열 + i + 1이 되어버림
            System.out.println("학생 " + (i + 1) + "의 점수: " + students[i]);
        }


    }
}
