package oopTest.loop.ex;

public class WhileEx3 {

    /*
    * 누적 합 게산
    * 반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하라.
    * sum이라는 변수를 사용하여 누적 합을 표현하고
    * i라는 변수를 사용하여 카운트 해야한다 (1부터 max까지 증가하는 변수)
    * while문을 사용하여 작성하라.
    * */
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
