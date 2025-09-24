package etc.exception.throw_;

public class ThrowExample {


    static int calcTotal(int end) throws ArithmeticException {
        if (end <= 0){
            throw new ArithmeticException("매개 값은 양수로 주세요.");
            // 예외를 던질 때 아무거나 던지면 받을 때 혼동이 올 수 있어서
            // 소통을 충분히 하고 서로 어울리고 맞는 예외 타입을 던지고 받아야 한다.

        }   // retrun을 단독으로 쓸 수 있는 곳은 void 메서드이다.

        int total = 0;
        for (int i = 1; i <= end; i++){
            total += i;
        }
        return  total;
    }


    public static void main(String[] args) {
        try {
            int result1 = calcTotal(100);
            System.out.println("result1 = " + result1);

            int result2 = calcTotal(-120); // i <= end;  end 가 음수면 반복문이 실행이 바로 종료됨
            System.out.println("result2 = " + result2); // 에러가 안 남

        } catch (ArithmeticException e) {
            System.out.println("catch문 실행");
        }

        System.out.println("프로그램 정상 종료");
    }
}
