package Sprint.Ms1;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 구구단 2단부터 9단까지 출력하는 프로그램을 작성하세요. for문을 사용
        // 출력 예시 (띄어쓰기와 개행에 유의)
        //=== 2단 ===
        //2 × 1 = 2
        //2 × 2 = 4
        //2 × 3 = 6
        //2 × 4 = 8
        //2 × 5 = 10
        //2 × 6 = 12
        //...
        //2 × 9 = 18
        //
        //=== 3단 ===
        //3 × 1 = 3
        //3 × 2 = 6
        //3 × 3 = 9
        //3 × 4 = 12
        //3 × 5 = 15
        //...

        for (int i = 2; i <= 9; i++) {                     // i를 2부터 9까지 1씩 증가시키면서 반복 (몇 단인지 결정)
            System.out.println("=== " + i + "단 ===");     // 현재 단(i단) 제목 출력

            for (int j = 1; j <= 9; j++) {                 // j를 1부터 9까지 반복 (곱할 숫자)
                System.out.println(i + " × " + j + " = " + (i * j));
                // "i × j = (i*j)" 형식으로 결과를 출력
                // 예: i=2, j=3 → "2 × 3 = 6"
            }
            System.out.println();                          // 각 단이 끝난 뒤 빈 줄 출력 (보기 좋게 줄 띄움)
        }

    }
}
