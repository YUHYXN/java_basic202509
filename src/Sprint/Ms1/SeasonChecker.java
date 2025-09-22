package Sprint.Ms1;

public class SeasonChecker {
    //월(month) 값을 입력받아(7월로 가정) switch문을 사용하여 해당 월의 계절을 출력하는 프로그램을 작성하세요.
    //
    //3, 4, 5월: 봄
    //6, 7, 8월: 여름
    //9, 10, 11월: 가을
    //12, 1, 2월: 겨울

    //출력 예시 :7월은 여름입니다.
    public static void main(String[] args) {
        int month = 7; // 예시로 7월을 사용
        String season;

        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 월입니다.";
                break;
        }

        System.out.println(month + "월은 " + season + "입니다.");
    }
}

//여러 case를 연속으로 쓰면 같은 결과를 처리할 수 있습니다
//break가 없으면 다음 case로 계속 실행됩니다 (fall-through)
//default case는 모든 case에 해당하지 않을 때 실행됩니다
