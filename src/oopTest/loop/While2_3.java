package oopTest.loop;

public class While2_3 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 100; //이만큼 반복하는거

        // i = 1 , endNum = n
        // 조건 자체가 while 문에서 i <= endNum 이렇게 해서 i가 endNum 보다 작거나 같을 때까지 반복한다.
        // 예를 들어 endNum 이 3이면
        // i = 1, 1 <= 3 true
        // i = 2, 2 <= 3 true
        // i = 3, 3 <= 3 true
        // i = 4, 4 <= 3 false 종료 3까지만 반복하는 것이다.
        while(i <= endNum){
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;

        }
    }
}
