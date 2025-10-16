package oopTest.loop;

public class While1_1 {
    public static void main(String[] args) {

        int count = 0;

        count = count + 1;
        System.out.println("count: " + count);
        count = count + 1;
        System.out.println("count: " + count);
        count = count + 1;
        System.out.println("count: " + count);
        /*
        * count++ << 증감 연산자로 할 수 있다 그러나..
        * while문을 사용하면 더 간결하게 할 수 있다.
        * */

        /*
        * 조건식이 참이변 실행/거짓이변 종료
        * 참이면 실행 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다(무한루프).
        * */
//        while (조건식){
//            // 실행코드
//        }


    }
}
