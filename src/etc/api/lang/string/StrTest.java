package etc.api.lang.string;

public class StrTest {

    public static void main(String[] args) {

        // 시작시간이랑 끝나는 시간을 활용해여 몇 초가 걸리는지 확인하는 방법
        long start = System.currentTimeMillis();


//        String str = "a";
//        for (int i = 0; i < 500000; i++) {
//            str += "a";
//        } // 7.401초



        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        } // 0.041초


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

    }

}

