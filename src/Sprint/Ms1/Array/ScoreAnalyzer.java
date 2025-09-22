package Sprint.Ms1.Array;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        //학생 5명의 점수 배열 {85, 90, 78, 92, 88}에서 평균을 계산하고, 평균보다 높은 점수와 낮은 점수의 개수를 구하는 프로그램을 작성하세요.
        //
        //출력 예시:
        //
        //평균: 86.6
        //평균보다 높은 점수 개수: 3
        //평균보다 낮은 점수 개수: 2

        // 배열 선언 및 초기화
        int[] scores = {85, 90, 78, 92, 88};  // 다섯 개의 점수를 배열에 저장
        int sum = 0;                          // 점수 총합을 저장할 변수
        int countAboveAverage = 0;             // 평균보다 높은 점수 개수
        int countBelowAverage = 0;             // 평균보다 낮은 점수 개수
        double average;                        // 평균 점수를 저장할 변수 (실수형)

        // 평균 계산
        for (int score : scores) {             // 배열의 점수를 하나씩 꺼내서
            sum += score;                      // sum에 계속 더해줌
        }
        average = (double) sum / scores.length; // 총합 ÷ 점수 개수 = 평균 (int 나눗셈 방지 위해 double 변환)
        System.out.printf("평균: %.1f\n", average); // 평균을 소수 첫째 자리까지 출력

        // 평균보다 높은/낮은 점수 개수 세기
        for (int score : scores) {             // 배열의 점수를 하나씩 꺼냄
            if (score > average) {             // 점수가 평균보다 크면
                countAboveAverage++;           // 높은 점수 개수 증가
            } else if (score < average) {      // 점수가 평균보다 작으면
                countBelowAverage++;           // 낮은 점수 개수 증가
            }
        }

        // 최종 출력
        System.out.println("평균보다 높은 점수 개수: " + countAboveAverage);
        System.out.println("평균보다 낮은 점수 개수: " + countBelowAverage);

        //(double) sum으로 형변환하여 정확한 평균을 계산합니다
        //첫 번째 루프에서 합계를 구하고, 두 번째 루프에서 개수를 셉니다
        //평균과 정확히 같은 점수가 있을 수도 있으므로 else if를 사용했습니다
        //향상된 for문을 활용하여 코드를 간결하게 작성했습니다

    }
}
