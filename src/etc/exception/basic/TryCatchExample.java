package etc.exception.basic;

public class TryCatchExample {


    // 예외처리 예시 시작

    public static void main(String[] args) {
        // 자바의 예외처리 문법 - 트라이캐치
        try{
            // try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
            // 예외가 발생할 가능성이 없는 코드는 try 블록 밖에 작성하는 것이 좋습니다.
            int i = 20, j = 0;

            System.out.printf("%d / %d = %d\n", i, j, i/j);
            System.out.println("프로그램 정상 종료");

        }catch (Exception e){   // Exception e : 모든 예외를 처리하는 매개변수를 선언
            System.out.println("0으로 나눌 수 없습니다.");
            // 캐치 쪽 매개변수로 다형성을 발생시킴
            // 내가 무슨 오류가 발생할지 모르겠다 하면 Exception 으로 잡아라 시중의 대부분 예외는 Exception 으로 잡을 수 있다.
            // ArithmeticException e : 산술적 예외를 처리하는 매개변수를 선언
            // NullPointerException e : 널포인터 예외를 처리하는 매개변수를 선언
            // ArrayIndexOutOfBoundsException e : 배열 인덱스 범위 예외를 처리하는 매개변수를 선언
            // NumberFormatException e : 숫자 형식 예외를 처리하는 매개변수를 선언
            // IOException e : 입출력 예외를 처리하는 매개변수를 선언
            // SQLException e : SQL 예외를 처리하는 매개변수를 선언
            // FileNotFoundException e : 파일을 찾을 수 없는 예외를 처리하는 매개변수를 선언
            // ClassNotFoundException e : 클래스를 찾을 수 없는 예외를 처리하는 매개변수를 선언
            // catch 블록에는 예외가 발생했을 때 실행할 코드를 배치합니다.
            // 실행할 내용을 작성합니다.
        }
        System.out.println("프로그램 정상 종료");
    }
}
