package etc.anonymous;

public class Main {

    public static void main(String[] args) {

        Calculator cal;

        cal = new AddCalculator();
        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        // 익명클래스 (인터페이스 구현체를 즉석에서 선언 후 사용)
        cal = new Calculator() {

            @Override
            public int operate(int n1, int n2) {
                return n1 - n2;
            }
        };

        int r2 = cal.operate(50, 27);
        System.out.println("r2 = " + r2);


        int r3 = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }.operate(50, 27);// 일회용 끝나자마자 오퍼레이트 불러버림 || 그리고 바로 버림
        System.out.println("r3 = " + r3);

        // 람다 (1.8 이상부터 사용 가능)
        // 사용 전제 조건
        // -> 반드시 인터페이스 안에 추상메서드가 1개여야 한다!
        cal = (n1, n2) -> n1 / n2;

        int r4 = cal.operate(27, 6);
        System.out.println("r4 = " + r4);

        cal = (n1, n2) -> {
            System.out.println("람다식 여러 줄 쓰기~.");
            return n1 % n2;
        };

        int r5 = cal.operate(67, 8);
        System.out.println("r5 = " + r5);


    }
}
