package Sprint.Ms1;

public class FizzBuzz {
    //1부터 100까지의 숫자 중에서 3의 배수와 5의 배수를 모두 찾아 출력하는 프로그램을 작성하세요.
    //
    //3의 배수인 경우 "Fizz", 5의 배수인 경우 "Buzz", 15의 배수인 경우 "FizzBuzz"를 출력하세요.
    //
    //출력 예시:
    //
    //1
    //2
    //Fizz
    //4
    //Buzz
    //Fizz
    //7
    //8
    //Fizz
    //Buzz
    //11
    //Fizz
    //13
    //14
    //FizzBuzz
    //16
    //17
    //Fizz
    //19
    //Buzz
    //...

    public static void main(String[] args) {
        // 1부터 100까지 반복
        for (int i = 1; i <= 100; i++) {
            // i가 15의 배수일 경우 (즉, 3과 5 둘 다의 배수)
            // 나머지를 구하는 연산자 % 를 사용하여 배수를 확인
            // 15의 배수 조건을 먼저 검사해야한다. (3과 5의 배수이기도 하므로)
            // 조건의 순서가 중요하다.
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            // i가 3의 배수일 경우
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // i가 5의 배수일 경우
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // 위 조건에 해당하지 않으면 숫자 그대로 출력
            else {
                System.out.println(i);
            }
        }
    }

}
