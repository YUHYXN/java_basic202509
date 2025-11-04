package oopTest.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        /*
        * 문제 : 배열의 입력과 출력
        * 사용자에게 5개의 정수를 입력 받아 배열에 저장하고, 입력 순서대로 출력하자.
        * 출력시 출력 포멧은 5,4,3,2,1 과 같이 콤마로 구분하여 역순 출력하자.
        * 마지막에 쉼표를 넣지 않아야한다.
        *
        * */

        Scanner scanner  = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("입력한 정수: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
