package Sprint.Ms1;

public class SumCalculator {

    public static void main(String[] args) {
        //사용자가 0을 입력할 때까지 계속해서 숫자를 입력받아 합계를 구하는 프로그램을 작성하세요.
        //(입력값: 10, 20, 30, 0 으로 가정)
        //
        //출력 예시:
        //
        //합계: 60

        // 미리 정의된 입력값들

        int[] inputs = {10, 20, 30, 0};   // 정수(int) 값들을 저장하는 배열. 안에 [10, 20, 30, 0] 이 들어 있음
        int inputIndex = 0;               // 배열에서 몇 번째 값을 꺼낼지 가리키는 "위치 표시기". 처음은 0번(첫 번째 값)
        int sum = 0;                      // 숫자들의 합계를 저장할 변수. 시작은 0으로 설정

        while (true) {                    // "무한 반복문" → 조건이 true라서 계속 반복됨. 안에서 break 만나면 멈춤
            int number = inputs[inputIndex++];  // 배열에서 현재 위치(inputIndex)의 값을 꺼냄
                                            // 그리고 inputIndex를 1 증가시킴 (다음 값을 가리키도록)
            if (number == 0) {            // 꺼낸 값이 0이면
                break;                    // 반복문을 완전히 멈춤
            }
            sum += number;                // 0이 아니라면, sum에 그 숫자를 더함 (sum = sum + number)
        }

        System.out.println("합계: " + sum); // 최종적으로 계산된 합계를 화면에 출력
    }

    //실습 해설
    //
    //while (true)로 무한 루프를 만들고 break로 종료합니다
    //sum += input는 sum = sum + input의 축약형입니다
    //입력값을 배열로 미리 정의하여 실제 입력을 시뮬레이션했습니다

}
