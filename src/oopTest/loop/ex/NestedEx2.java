package oopTest.loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {

        // 별찍기

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for(int j =1; j <= i; j++){ // 여기왔다가 하나씩 추가해서 별을 찍게됨
                System.out.print("*");
            }
            System.out.println(); // 별 하나 찍고 나서 줄바꿈 꼭 외부 for문에 있어야함.
        }
    }
}
