package basic.constate;

public class SwitchExample {
    public static void main(String[] args) {

        String gender = "M";

        // if문처럼 논리형 조건식이 들어가는게 아니라
        // 분기를 나눌 기준 값이 괄호 안에 들어감. (문자열, 정수만 가능)

        switch(gender){
            // 만약 상위 M이 소문자 m이라면?
            // 아래 나열은 java 14버전 이후 개선된 case문법
            // case "Men":   << 이전 버전이면 이렇게 해줘야함..
            case "M", "m", "남", "ㅡ": // case 뒤에는 분기할 값을 넣음
                System.out.println("남성 입니다.");
                break; // 해당 case만 실행 하고 switch문을 종료함, 하위 case 미실행
            case "F", "f", "여", "ㄹ":
                System.out.println("여성 입니다.");
                break;

            default: // case를 설정하지 않은 값들은 모두 default로 처리됨
                System.out.println("잘못된 입력입니다.");
                break;
        }


    }
}
