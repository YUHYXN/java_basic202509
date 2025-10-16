package oopTest.loop;

public class While1_2 {
    public static void main(String[] args) {

        int count = 0;

        while(count < 3){
//            count = count + 1;
            count++;
            System.out.println("count: " + count);
        }   // 만약 count 가 3이 되면 조건식이 false가 되어 종료된다. 바로 여기로 이동해서 종료하고 다음 걸로 넘어간다.
        // 만약 조건식이 count < 100 이면 코드를 100번 반복함.

        System.out.println("---------------------------");
        /*
        * 조건식이 참이변 실행/거짓이변 종료
        * 참이면 실행 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다(무한루프).
        * */
//        while (조건식){
//            // 실행코드
//        }


    }
}
