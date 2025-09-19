package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        // 2차원 배열 = 배열 안에 배열이 있는 형태
        // 더블 인덱싱 값을 넣거나 바로 담거나 뭐 이런
        // 배열은 선언할 때, 각 index의 값이 비어있는게 아니라, 0(각 타입의 기본 값)으로 초기화 되어있음
        // 기본값
        // 정수 0, 실수 0.0, 문자 (공백) 기타 null <<<<<<<<<
        int[][] arr = new int[3][4]; // 3행 4열
        arr[1][1] = 100;
        // 1차원 배열은 Arrays.toString() 2차원 배열은 Arrays.deepToString()
        System.out.println(Arrays.deepToString(arr));

        System.out.println("\n======================");

        // 중첩 for문으로 2차원 배열 출력하기
        for(int [] a : arr){
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();   // 괄호를 채우지 않으면 줄 개행만 된다.
        }


    }
}
