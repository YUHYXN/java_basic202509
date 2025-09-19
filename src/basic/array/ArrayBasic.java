package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 1. 배열 변수 선언
        int [] numbers;

        // 2. 배열 객체 생성
        numbers = new int[5];

        // 3. 배열 내부 초기화
        // 인덱스를 지목해서 데이터를 할당.
        // 인덱스는 0부터 1씩 증가함

        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14;    // 강제 형변환을 하면 넣을 수 있다 대신..3으로 됨 int로 형변환해서
        numbers[3] = numbers[0] + 20; // 70
        numbers[4] = 100;
//        numbers[4] = "메롱"; (X)
//        numbers[5] = 10;  --> (X) 인덱스 범위 초과 빨간 줄 안 뜨니까 잘 봐야함

        // 4. 배열의 길이를 알아내는 법
        System.out.println("\n==============================1");
        System.out.println(numbers.length);

        // 5. 배열의 순회 (꺼내먹어요)
        System.out.println("\n==============================2");

        for (int i = 0; i < numbers.length ; i++) {  // 진짜 깔끔하게 인덱스를 반복문으로 출력할 수 있음
            System.out.println(numbers[i]);
        }

        // 배열의 순회 forEach (향상된 for문)
        System.out.println("\n==============================3");
        for (int n : numbers) {  // 우항에는 내가 계산하고싶은 배열을 입력하고 좌항에는 값을 받아 줄 변수를 선언
            // numbers는 int[] 타입이니까 좌항에는 int 타입 변수를 선언
            // numbers 배열에서 index를 순서대로 값을 하나씩 꺼내서 n 변수에 담아줌
            System.out.println(n);
            // 그리고 실행
        }

        // 배열 내부 문자열 형태로 한 번에 출력하기~!~!
        System.out.println("\n==============================4");
        // 이건 그냥 확인용임 활용은 for문 하셈
        System.out.println(Arrays.toString(numbers));
        // Arrays라는 자바 유틸 패키지 안에 toString()이라는 메서드가 있음
        // 이 메서드는 배열을 전달받아서 내부 데이터를 문자열로 만들어줌


        // 배열 쉽게 초기화 하는 법 ㅋㅋ
        // 선언 당시 크기가 고정되며, 크기가 변할 수 없다.
        // 만약, 크기를 늘리거나 줄이고 싶으면 배열을 새로 만들어서 값을 옮겨야 한다.
        int [] pointList = {10, 20, 30, 40, 50}; // 선언과 동시에 초기화 (값을 알고 있다면 한 번에 다 때릴 수 있다.)
        // int [5] 처럼 그냥 길이 지정되는거임 위에도
        String [] pets = {"멍멍이", "야옹이", "짹짹이", "춘식이", "하츄핑"}; // String 배열도 가능
        // 나중애 배열의 크기를 조정해서 뭘 추가할 순 없고 인덱스 배열의 이름은 바꿀 수 있음
        System.out.println("\n==============================5");



    }
}
