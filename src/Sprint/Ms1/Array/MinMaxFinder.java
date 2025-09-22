package Sprint.Ms1.Array;

public class MinMaxFinder {
    public static void main(String[] args) {
        //정수 배열 {3, 7, 2, 9, 1, 5, 8}에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
        //
        //출력 예시:
        //
        //최댓값: 9
        //최솟값: 1

        int[] arr = {3, 7, 2, 9, 1, 5, 8};  // 정수 배열 선언 + 초기값 지정
        // 인덱스 0=3, 1=7, 2=2, 3=9, 4=1, 5=5, 6=8

        int max = arr[0];   // 최댓값을 저장할 변수. 시작은 배열의 첫 번째 값(3)
        int min = arr[0];   // 최솟값을 저장할 변수. 시작은 배열의 첫 번째 값(3)

        for (int i = 1; i < arr.length; i++) {  // i=1부터 배열 끝까지 순회 (첫 번째 값은 이미 비교에 썼으니까)
            if (arr[i] > max) {                 // 현재 값이 max보다 크면
                max = arr[i];                   // max를 현재 값으로 변경
            }
            if (arr[i] < min) {                 // 현재 값이 min보다 작으면
                min = arr[i];                   // min을 현재 값으로 변경
            }
        }

        System.out.println("최댓값: " + max);   // 배열에서 가장 큰 값 출력
        System.out.println("최솟값: " + min);   // 배열에서 가장 작은 값 출력

        //실습 해설
        //
        //첫 번째 요소로 max와 min을 초기화합니다
        //두 번째 요소부터 비교를 시작합니다 (i = 1)
        //각 요소와 현재 최댓값/최솟값을 비교하여 갱신합니다
        //향상된 for문을 사용한 다른 방법도 가능합니다

        //for (int num : arr) {        // 배열 arr에서 값을 하나씩 꺼내 num에 저장
        //    if (num > max) {         // 꺼낸 값이 현재 max보다 크면
        //        max = num;           // max 갱신
        //    }
        //    if (num < min) {         // 꺼낸 값이 현재 min보다 작으면
        //        min = num;           // min 갱신
        //    }
        //}
        //
        //System.out.println("최댓값: " + max);
        //System.out.println("최솟값: " + min);
    }
}
