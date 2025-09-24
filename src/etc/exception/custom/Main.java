package etc.exception.custom;

public class Main {
    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc1234", "aaa111");

        String result = null;

        try {
            result = user.authenticate("abc123", "1111");
        } catch (LoginInvaildException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("입력하신 값: " + e.getInvalidAccount());
        }

        System.out.println("result = " + result);
    }
}
