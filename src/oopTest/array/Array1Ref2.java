package oopTest.array;

public class Array1Ref2 {

    public static void main(String[] args) {

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 배열 값 사용 // 배열 리펙토링
        for (int i = 0; i < 5; i++) {   // i = 0번부터고, i는 5보다 작을때까지 1씩 증가한다.
            // (i + 1) 괄호를 지우면 안됨, 연산자 우선순위 때문에  문자열 + i + 1이 되어버림
            System.out.println("학생 " + (i + 1) + "의 점수: " + students[i]);
        }


    }
}
