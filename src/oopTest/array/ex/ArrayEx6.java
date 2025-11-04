package oopTest.array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    /* 가장 작은 수, 큰 수 찾기
    * 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아
    * 출력하는 프로그램을 장성하자 실행결과 예시는 아래와 같다.
    *
    * 입력받을 숫자의 개수를 입력하세요: 3
    * 3개의 정수를 입력하세요:
    * 1
    * 2
    * 3
    * 가장 작은 정수: 1
    * 가장 큰 정수: 5
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int mimNumber, maxNumber;
        System.out.println(n + "개의 정수를 입력하세요: ");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 초기화
        mimNumber = maxNumber = numbers[0];
//        maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < mimNumber) {
                mimNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + mimNumber);
        System.out.println("가장 큰 정수: " + maxNumber);







    }
}
