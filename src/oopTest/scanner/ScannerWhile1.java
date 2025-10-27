package oopTest.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("문자열을 입력하세요 (exit 입력시 종료): ");
            String string  = scanner.next();
            if(string.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + string);
        }




    }
}
