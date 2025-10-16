package oopTest.loop;

public class Break3 {
    public static void main(String[] args) {

        // for문 제일 깔끔한 버전

        int sum = 0;

        for(int i = 1; ;i++){
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
        }

    }
}
