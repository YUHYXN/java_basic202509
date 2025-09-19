package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {

        // 30 ~ 100 사이에 소수가 몇개가 있는지 세어보기

        int total = 0; // 소수의 개수를 세기 위한 변수
        // 반복문 안에 반복문 (중첩반복문)

        for(int i = 30; i <= 100; i++)   {

            int count = 0; // i가 바뀔 때마다 숫자를 새로 세어줘야 하기 때문에 여기에 선언해야한다.
            for (int j = 1; j <= i; j++){
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                total++;
            }
        }
        // begin - end 가 명확하면 for 문이고
        // 만약 모호하고 명확하지 않다면 while 문을 쓰는게 좋다.
        // 보통 무한루프를 와일문으로 쓴다


        System.out.println("total = " + total);

        // 잘 안 써봐서 어려움..


    }
}
