package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) {

        // 표준 입력 함수가 없는데 입력 객체를 제공한다.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        try {
            System.out.print("정수: ");
            int n = sc.nextInt();

            int result = 100 / n; // ArithmeticException
            System.out.println(arr[result]);

            String s = null;
            s.equals("메롱");
            /*
			 - 다중 catch문은 실제로 에러가 발생하면
			  위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
			  부모 타입의 예외를 자식 타입의 예외보다 위에 작성하시면 안됩니다.

			 - catch 옆에 괄호에 예외 타입을 여러 개 작성하고 싶은 경우는
			  | 기호를 사용하여 타입을 나열해 주시면, 하나의 catch 블록으로
			  여러 타입의 예외를 동시에 처리할 수 있습니다.
			  (java 7버전부터 가능한 문법)
			 */
        } catch (InputMismatchException | ArithmeticException e) {  // 하나의 catch 블록에서 여러 예외 처리 가능
            // InputMismatchException e : 입력 형식 예외를 처리하는 매개변수를 선언
            // ArithmeticException e : 산술적 예외를 처리하는 매개변수를 선언
            System.out.println("입력값에 문제가 있습니다\n (정수 아님 or 0)");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났는데요>");
        } catch (Exception e){
            // Exception e : 모든 예외를 처리하는 매개변수를 선언 마지막에 꼭 선언 해주면 좋음.. 위에서 다 잡고있어서
            // 얘는 맨 마지막에 적어줘야 오류가 안남
            System.out.println("뭔가 오류가 발생했어요..");
        } finally { // 예외가 안 터져도 실행 됨
            System.out.println("예외가 발생하든 말든 무조건 실행되는 finally 블록입니다.");
            sc.close();
        }


    }
}
