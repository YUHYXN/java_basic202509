package oopTest.array;

public class Array1Ref4 {

    public static void main(String[] args) {

        // 1차원 배열

        int[] students = {90,80,70,60,50}; // 배열 생성과 초기화를 아주 간략하게 할 수 있음 ㅇㅇ... 실제로 new int[] 도 생략 되지만 써진 효과

        // 배열 값 사용 // 배열 리펙토링
        for (int i = 0; i < students.length; i++) {   // i = 0번부터고, students.length보다 작을때까지 1씩 증가한다. 덕분에 배열이 늘어나도 수정할 게 없음.
            // (i + 1) 괄호를 지우면 안됨, 연산자 우선순위 때문에  문자열 + i + 1이 되어버림
            System.out.println("학생 " + (i + 1) + "의 점수: " + students[i]);
        }


    }
}
