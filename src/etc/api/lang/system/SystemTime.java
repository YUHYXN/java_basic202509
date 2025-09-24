package etc.api.lang.system;

public class SystemTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초 기준으로 현재까지 흐른 시간을 밀리세컨드 단위로 반환

        int total = 0;
        for (int i = 0; i < 200000000; i++){
            total += i;

        }
        long end = System.currentTimeMillis();

        System.out.println("실행 소요시간: " + (end - start) * 0.001 + "초");
        System.out.println(System.getProperties());
    }
}
