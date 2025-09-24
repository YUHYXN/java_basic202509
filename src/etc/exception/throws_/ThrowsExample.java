package etc.exception.throws_;

public class ThrowsExample {

    // 다국어 인사말 배열
    // 스태틱 스트링 배열에 스트링스라는 배열을 담음
    static String[] greetings = {"안녕하세요", "Hello", "니하오", "곤니찌와"};
    /*
    # throws

    - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
     예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.

    - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
     예외 처리를 강요하고 싶을 때 사용합니다.

    - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
    */
    // 객체 없이 호출 가능
    static void greet(int idx) throws Exception{ // 예외를 호출한 곳으로 떠넘김
        System.out.println(greetings[idx]);
    }
    /*
      이렇게 throw Exception 을 해주면 greet(3); 에서 예외가 발생했을 때
      예외 처리를 main 메서드로 떠넘기게 된다.
      그래서 main 메서드에서 try - catch 문으로 예외 처리를 해주면 된다.
     */

    public static void main(String[] args) {
    // try - catch 문으로 예외 처리
        try {
            greet(4);
        } catch (Exception e) {
            System.out.println("인덱스 범위를 벗어났습니다.");
            e.printStackTrace();    // 정상 종료됐는데, 얘 덕분에 에러가 발생하는 이유를 볼 수 있음
            // 에러의 원인을 역추적해 볼 수 있음

//            System.out.println(e.getMessage()); // 에러 '메시지'만 출력
        }

    }
}
