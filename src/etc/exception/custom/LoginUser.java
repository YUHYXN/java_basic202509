package etc.exception.custom;

// 로그인 검증을 수행하는 클래스
public class LoginUser {
    private final String account;

    private final String password;

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 로그인 검증 기능
    public String authenticate(String inputAccount, String inputPassword) throws LoginInvaildException{

        if (!this.account.equals(inputAccount)){    //같지 않다면?
            throw new LoginInvaildException("회원가입이 되지 않은 계정입니다.", inputAccount);
        }
        if (!this.password.equals(inputPassword)){
            throw new LoginInvaildException("비밀번호가 틀렸습니다.", inputAccount);
        }
        System.out.println("로그인 성공");
        return "로그인 성공";
    }
}


