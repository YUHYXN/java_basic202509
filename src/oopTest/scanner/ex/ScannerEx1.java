package oopTest.scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();    // 정수를 받아야해서 nextInt 사용

        System.out.println("당신의 이름은" + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
