package Sprint.Ms1.Array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // 5개의 학생 점수를 배열에 저장하고 {85, 90, 78, 92, 88} 향상된 for문(enhanced for loop)을 사용하여
        // 모든 점수를 출력하는 소스를 작성.
        //출력 예시:
        //
        //85점
        //90점
        //78점
        //92점
        //88점
        int[] scores = {85, 90, 78, 92, 88};
        //int[]는 정수(int) 여러 개를 한 번에 담는 배열 타입.
        //{85, 90, 78, 92, 88} 이렇게 여러 개의 값을 한 번에 넣으려면 “묶음(배열)“이 필요
        //그래서 변수 하나(int)로는 불가능하고, 배열(int[])로 선언해야 함
        for (int score : scores) { // 향상된 for문
            // scores 배열에서 하나씩 score 변수에 값을 꺼내서 반복
            System.out.println(score + "점");
        }

        //실습 해설
        //
        //향상된 for문: for (자료형 변수명 : 배열명)
        //배열의 모든 요소를 순차적으로 접근할 때 편리합니다
        //인덱스 없이 직접 요소에 접근합니다
        //읽기 전용으로 사용할 때 권장됩니다


    }
}
