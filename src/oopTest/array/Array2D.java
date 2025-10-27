package oopTest.array;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr2d = new int[3][4];
        // 3행 4열짜리 2차원 배열 선언

        //2차원 배열에 값 넣기
        arr2d[1][2] = 50;
        arr2d[2][0] = 70;

        //결과 (인덱스는 다시 말하지만 0부터 시작이다)
//        {
//            {0, 0, 0, 0},
//            {0, 0, 50, 0}, // 1행 2열에 50
//            {70, 0, 0, 0} // 2행 0열에 70
//        }


        System.out.println("================================");

        /*
        *   요렇게 작성하면 모든 데이터를 전부 출력할 수 있다.
            향상 for문으로 보면 더 이해하기 쉽다.
            바깥쪽 향상 for문의 좌항을 보라. arr2d는 2차원 배열이니까
            배열 덩어리를 받기 위해 `int[]` array로 타입을 설정한 것을 볼 수 있다.
            그리고 나서 한번 더 향상 for문을 이용해서 array를 올려 놓고
            안쪽의 데이터를 하나씩 전달받는 것을 확인할 수 있다.
            *
        * */

        for(int[] array : arr2d) {
            for(int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("================================");

        int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77} //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균의 평균)
        */

        /*
            스캐너는 단순한 입출력 확인을 위한 도구임
            터미널에 입력할 수 있는 것이 뜸 그냥 테스트용도
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();









    }

}
