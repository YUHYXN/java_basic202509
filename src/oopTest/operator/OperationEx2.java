package oopTest.operator;

public class OperationEx2 {
    public static void main(String[] args) {
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum = var1 + var2 + var3;
        System.out.println("sum = " + sum); // 7.5 출력

        double avg = sum / 3;
        System.out.println("avg = " + avg); // 2.5 출력
    }
}
