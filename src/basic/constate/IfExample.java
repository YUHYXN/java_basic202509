package basic.constate;

public class IfExample {
    public static void main(String[] args) {
        // 자바는 기본적으로 메인 함수가 있어야 프로그램 실행이 가능하다.
        // 메인 함수 템플릿을 선택해서 쉽게 작성 가능 psvm + 탭

        int score = 65;
        // 조건문으로 만약에 70점이 넘으면 합격 아니면 불합격
        if (score >= 70) {
            // sout + 탭
            System.out.println("70점 이상이므로 합격 입니다.");
        }else {
            System.out.println("70점 미만이므로 불합격 입니다.");
        }

        System.out.println("시험 치르느라 수고 많았어요.");
    }

}
