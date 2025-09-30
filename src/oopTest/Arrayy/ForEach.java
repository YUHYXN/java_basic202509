package oopTest.Arrayy;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        // forEach 향상된 for문
        // 배열이나 컬렉션의 모든 요소를 처음부터 끝까지 반복할 때 사용
        // for (배열 요소를 받을 수 있는 변수 : 배열 또는 컬렉션 이름) {
        //    실행문;
        // }

        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        /*
        for(int i=0; i<week.length; i++) {
            System.out.println(week[i] + "요일 좋아~!");
        }
        */
        for(String day : week) {
            System.out.println(day + "요일 좋아~"); // 월~일까지 요일 좋아를 받을 수 있다.
        }

        int[] numbers = {1, 2, 3, 4, 5};
        //i는 0부터 배열 길이 미만 -> 배열의 전범위를 지정.
        for (int idx=0; idx<numbers.length; idx++) {
            System.out.printf("배열의 %d번째 데이터: %d\n"
                    , idx+1, numbers[idx]);
        }


        /*
        * 배열의 수정과 탐색
        * */

        String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
        foods[0] = "치킨";
        foods[2] = "탕수육";

        System.out.println(Arrays.toString(foods));

        Scanner sc = new Scanner(System.in);
        System.out.print("탐색할 음식을 입력하세요: ");
        String name = sc.next();

        // 첫번째 방법
        // boolean 타입의 변수를 선언하여 존재 유무를 확인해 준다.
        // 찾았으면 true로, 반복문 다 돌릴 때 까지 못찾았으면 false로.
        // 반복문이 끝나고 나서 확인해 주자.
        boolean flag = false;
        for(int i = 0; i < foods.length; i++) {
            if(name.equals(foods[i])) {
                System.out.println("탐색 완료!");
                System.out.println("인덱스: " + i + "번");
                flag = true;
                break;
            }
        }
        if(!flag) { //flag == false
            System.out.println("없는 음식입니다.");    // flag = true면 탐색 성공임 위에 목록엔 없음
        }

        // 두번째 방법.
        // 탐색하지 못한다면 반복문이 끝까지 돌아가면서 i의 값이 배열의 길이와 같아지며
        // 반복문의 조건식을 false로 만들면서 탈출하는 것을 이용.
        // i가 배열의 길이와 같아졌다면 탐색하지 못했다는 증거.
        int i;
        for(i = 0; i < foods.length; i++) {
            if(name.equals(foods[i])){
                System.out.println("탐색 완료!");
                System.out.println("인덱스: " + i + "번");
                break;
            }
        }

        if(i == foods.length) {
            System.out.println("없는 음식입니다.");
        }
    }
}
