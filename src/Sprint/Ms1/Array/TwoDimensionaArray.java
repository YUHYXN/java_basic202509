package Sprint.Ms1.Array;

public class TwoDimensionaArray {
    public static void main(String[] args) {
        //3x3 크기의 2차원 배열을 생성하고 다음과 같이 초기화한 후, 모든 요소를 출력하는 프로그램을 작성하세요.
        //
        //1 2 3
        //4 5 6
        //7 8 9

        // 3x3 2차원 배열 선언 및 초기화
        int[][] array = {
                {1, 2, 3},   // 첫 번째 행
                {4, 5, 6},   // 두 번째 행
                {7, 8, 9}    // 세 번째 행
        };

        // 2차원 배열 출력
        for (int[] ints : array) {          // array에서 한 행(int[])을 꺼냄
            for (int anInt : ints) {        // 행에서 값을 하나씩 꺼냄 (열 요소)
                System.out.print(anInt + " "); // 값 출력 (뒤에 공백 추가)
            }
            System.out.println();           // 한 행 출력이 끝나면 줄바꿈
        }

        //int[][] array 는 2차원 배열 → “행”과 “열” 구조로 값이 저장됨.
        //바깥 for문 → 한 행(int[])을 가져옴.
        //안쪽 for문 → 그 행 안에서 각각의 값을 하나씩 꺼내 출력.
        //한 행이 끝나면 System.out.println() 으로 줄을 바꿔줌.


        //실습 해설
        //
        //int[][] matrix: 2차원 배열 선언
        //matrix.length: 행의 개수 (3)
        //matrix[i].length: i번째 행의 열의 개수 (3)
        //중첩 for문을 사용하여 행과 열을 순회합니다
        //matrix[i][j]로 i행 j열의 요소에 접근합니다



    }


}
