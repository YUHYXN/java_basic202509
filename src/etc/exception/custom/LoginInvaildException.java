package etc.exception.custom;

/**
 * @author : 강유현
 * @since : 2025.09.24 ~
 * @version : 1.0
 * @category : 사용자 정의 예외 클래스
 * @apiNote : LoginInvaildException은 로그인 실패 시 발생할 수 있는 예외입니다. id 없음 비밀번호 틀림은 모두 이 예외 타입으로 선언합시다.
 */

// extends를 exception 으로 하면 checked exception 이 됨
// extends를 RuntimeException 으로 하면 unchecked exception 이 됨
// RuntimeException 을 상속받아서 만든 예외는 예외처리를 강제하지 않음
// 즉, 예외처리를 강제하고 싶지 않을 때 RuntimeException 을 상속받아서 만들면 됨
// 예외처리를 강제하고 싶으면 Exception 을 상속받아서 만들면 됨
public class LoginInvaildException extends RuntimeException {

    // 나중에 예외 상황에 대한 추가 정보를 담기 위한 필드
    private final String inputAccount;


    public LoginInvaildException(String message, String inputAccount) {
        super(message);
        this.inputAccount = inputAccount;
    }

    public String getInputAccount() {
        return inputAccount;
    }


}
