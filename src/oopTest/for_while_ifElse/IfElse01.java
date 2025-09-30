package oopTest.for_while_ifElse;

public class IfElse01 {
    public static void main(String[] args) {
         /*
        1번 문제
        int age = 16;
        String result = (age >= 18) ? "성인" : "미성년자";
         */
        int age = 16;
        if (age >= 18){
            System.out.println("미성년자");
        }else {
            System.out.println("성인");
        }


        /*
        2번 문제
        int num = 7;
        String result = (num % 2 == 0) ? "짝수" : "홀수";
         */
        int num = 7;
        if(num % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }


        /*
        3번 문제
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
         */
        int score = 85;
        if (score >= 90){
            System.out.println("A등급 입니다.");
        } else if(score >= 80){
            System.out.println("B등급 입니다.");
        } else {
            System.out.println("C등급 입니다.");
        }


        /*
        4번 문제
        int x = -5;
        String type = (x >= 0) ? "양수 또는 0" : "음수";
         */
        int x = -5;
        if (x >= 0){
            System.out.println("양수 또는 0");
        } else {
            System.out.println("음수");
        }
    }
}
