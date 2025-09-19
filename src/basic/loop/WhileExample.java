package basic.loop;

import java.util.jar.JarEntry;

public class WhileExample {
    public static void main(String[] args) {

        // 반복문의 필수 3 요소 (begin - end - step)
        // begin : 반복문이 시작되는 시점
        // end : 반복문이 종료되는 시점
        // step : 반복문이 진행되는 단위

        int i = 1; // begin (시작을 지정)
        while (i <= 10) { // end (10보다 작거나 같을 때까지 라는 끝을 지정)
            System.out.println("안녕하세요");
            i++; // step (1씩 증가하게 단계를 설정)
        }

        // for(begin; end; step) { ...
        for(int j = 1; j <= 10; j++){
            System.out.println("안녕하세요!!!!");
        }

        System.out.println("==========================================");

        // 소수 판별 문제
        // 특정 값이 소수인지, 소수가 아닌지 판별하는 법 반복문으로
        // 반복문으로 해결
        int num = 97; // 판별할 숫자
        int k = 1; // begin
        int count = 0; // 약수의 개수를 세기 위한 변수 (나누어 떨어진 횟수를 세어 줄 변수)
        while (k <= num) {
            if(num % k == 0){ // num을 k로 나누었더니 딱 맞아 떨어지지나?
                count++; // 나누어 떨어졌다면 count 1 증가 (얘만 조건부로 올라감 당연 if문 안에 있으니까)
            }
            k++; // step  (얘는 무조건 반복문 1바퀴당 무조건 올라감)
        }
        if(count == 2){
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }




    }
}
