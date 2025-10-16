package oopTest.loop;

public class Break2 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;


        for(; ;){   // for문 무한루프 조건식이 없으먄 무한 반복함
            sum = sum + i;

            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;  // 단, beak문에서 빠져나감
            }
            i++;
        }

    }
}
