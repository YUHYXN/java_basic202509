package oopTest.cond;

public class CondOp2 {
    public static void main(String[] args) {

        // 삼항 연산자 초간단

        int age = 18;
        // 조건식 ? 참일때 값 : 거짓일때 값
        // age 가 18보다 크거나 작니 ? true면 "성인" false면 "미성년자"
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("나이: " + age + ", 상태: " + status);
    }
}
