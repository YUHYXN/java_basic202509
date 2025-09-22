package Sprint.Ms1;

public class PrimeFinder {
    public static void main(String[] args) {
        //1부터 20까지의 숫자 중에서 소수(prime number)를 모두 찾아 출력하는 프로그램을 작성하세요.
        //소수는 1과 자기 자신으로만 나누어지는 수입니다.
        //
        //출력 예시:
        //
        //1부터 20까지의 소수:
        //2 3 5 7 11 13 17 19

        System.out.println("1부터 20까지의 소수:");

        // 각 숫자에 대한 소수 판별
        for (int num = 2; num <= 20; num++) {       // num을 2부터 20까지 반복 (2~20 사이 숫자들을 검사)
            boolean isPrime = true;                 // 현재 숫자가 소수인지 표시하는 변수. 기본값은 true(소수라고 가정)

            // 2부터 num의 제곱근까지 나누어지는지 확인 (제곱근까지만 확인해도 충분함)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {                 // 만약 num이 i로 나누어 떨어지면 (즉, 약수가 있으면)
                    isPrime = false;                // 소수가 아님
                    break;                          // 더 이상 검사할 필요 없으니 반복문 종료
                }
            }

            if (isPrime) {                          // 소수라고 판정되면
                System.out.print(num + " ");        // num 값을 출력 (줄바꿈 없이 한 줄에 출력)
            }
        }

        System.out.println();                       // 마지막에 줄바꿈 (출력이 깔끔하게 끝나도록)

        //소수는 2부터 시작합니다 (1은 소수가 아님)
        //boolean isPrime 변수로 소수 여부를 추적합니다
        //나누어떨어지는 수가 하나라도 있으면 소수가 아닙니다
        //break를 사용하여 불필요한 계산을 줄입니다

    }
}
