package oopTest.for_while_ifElse;

public class While {
    public static void main(String[] args) {
//        while (조건식) {
//            // 실행될 코드
//        }

        int n = 1; //제어변수: 반복문의 횟수를 제어할 변수. (begin)

        while(n <= 10) { //논리형 조건식: 반복문의 끝을 지정. (end)
            System.out.println("안녕하세요. 반갑습니다~!" + n);
            n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조정 (step)
        }

        System.out.println("-------------------------------");

//1 ~ 10까지의 누적합계
        int i =1; //begin
        int total = 0; //누적합을 기억해줄 변수

        while(i <= 10) { //end
            total += i;
            i++; //step
        }

        System.out.println("1~10까지의 누적합: " + total);
    /*
    * `while`문을 실행시키기 위한 필수 3요소인 begin, end, step을 기억하자.
        반복문의 횟수를 제어하는 `제어변수`가 선언되고, `while` 키워드 옆 조건식은 해당 제어변수가
        어떤 조건에서 반복문을 종료시킬 수 있는지에 대한 끝을 지정한다.
        그리고 반복문 내에는 제어변수의 값을 변하게 해 주는 `증감식`을 배치하여 언젠가는 반복문의
        조건식을 false로 만들어 탈출할 수 있게 한다.
        이것이 가장 기본 형태의 반복문이다. begin, end, step 중 하나라도 누락된다면
        반복문이 이상하게 돌아갈 수 있음. 초반에는 주의하자.
        *
        *
        * # while문의 진행 순서.
            1. 제어변수를 선언함. (시작값이 정해짐)
            2. while문의 조건식을 검사해서 true면 반복문이 시작. false라면 반복문 종료.
            3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면) 다시 조건식을 검사하여 true라면 반복문 계속 진행,
            false라면 반복문 종료.
            4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정.
    * */
    }
}
