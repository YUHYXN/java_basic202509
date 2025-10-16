package oopTest.loop;

public class Nested1 {
    public static void main(String[] args) {

        /* 보니까, 외부 for는 2번이 실행되는데
        * 외부 for문 1번당 내부 for문이 3번씩 같이 실행됨
        * 그래서 총 6번이 출력됨
        * 외부 for 0번일 때 내부 for 0,1,2 실행되고,
        * 외부 for 1번일 때 내부 for 0,1,2 실행됨 총 6번 아아~ 이해했음
        * */

        for(int i = 0; i < 2; i++){
            System.out.println("외부 for 시작 i: " + i);    //시작 0으로 하고
            for (int j =0; j < 3; j++){ // 내부 for 3번 실행 됨.
                System.out.println("내부 for 시작 " + i + "-" + j); // 내부 for로 와서 j 0,1,2 찍고
            }
            System.out.println("외부 for 끝 i:  " + i);    // 여기서 다시 외부로 돌려보내고 1찍으러 갔다가 다시 내부 0,1,2 찍고 끝
            System.out.println();
        }

    }
}
