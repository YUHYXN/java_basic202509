package Sprint.Ms1;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        String grade;

        // if-else 문을 사용하여 학점 계산
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("점수: " + score + "점");
        System.out.println("학점: " + grade);

        //학생의 점수를 입력받아(85점으로 가정) 학점을 출력하는 프로그램을 작성하세요.
        //90점 이상: A
        //80점 이상: B
        //70점 이상: C
        //60점 이상: D
        //60점 미만: F
        //출력 예시:
        //점수: 85점
        //학점: B

        //if-else if 구조를 사용하여 여러 조건을 순차적으로 검사합니다
        //조건은 위에서부터 검사되므로 순서가 중요합니다
        //>= 비교 연산자를 사용하여 범위를 설정했습니다
    }
}

