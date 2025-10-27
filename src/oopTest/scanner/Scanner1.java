package oopTest.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();    // 입력을 String 문자열로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();        // 입력을 int 정수로 가져온다
        System.out.println("입력한 정수: " + num);

        System.out.print("실수를 입력하세요: ");
        double doubleVaule = scanner.nextDouble(); // 입력을 double 실수로 가져온다
        System.out.println("입력한 실수: " + doubleVaule);


    }
}
