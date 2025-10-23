package oopTest.scope;

public class Scope1 {
    public static void main(String[] args) {

        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작 현재 블록 안에서만 사용 가능

            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }

    }
}
