package oopTest.cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {

        // 학점에 따른 성취도 평가하기 스위치문

        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격 입니다.");
            default:
                System.out.println("잘못된 학점입니다.");
        }


    }
}
