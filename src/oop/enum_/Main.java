package oop.enum_;

public class Main {
    public static void main(String[] args) {

        Developer kim = new Developer();

        kim.setName("김춘식");
        kim.setCareer(3);
        kim.setLang(Language.PYTHON);

        Developer park = new Developer();

        park.setName("박주연");
        park.setCareer(5);
        park.setLang(Language.JAVA);

        System.out.println("춘식과 주연은 같은 언어를 쓰는가?: " + (kim.getLang() == park.getLang()));
        // 대소문자만 구분 못하는게 아니라 단어 식별에도 아예 똑같지 않으면 식별 못해서 enum으로 바꿀거임
        // ㄴ String lang; -> Language lang; 으로 바꿔주어서 String이 아니므로 == 가능
        // ㄴ enum은 상수이므로 == 가능

        // 이렇게 메서드를 이어서 쓰는게 메서드 체이닝이라고 한다.
        System.out.println("kim의 주력 언어: " + kim.getLang().getName());
        System.out.println("park의 언어는 compile 언어인가?: " + park.getLang().isCompileLang());

        System.out.println("===============================");

        // values() : enum 타입의 모든 상수를 배열로 리턴하는 메서드
        Language[] values = Language.values();
        for (Language lang : values) {
            System.out.println("value");
        }

        // ordinal() : 열거형 타입에 열거 되어있는 순서를 정수로 리턴
        System.out.println(park.getLang().ordinal());

        // valueOf("str) : 전달된 문자열과 일치하는 이름의 열거형 상수를 리턴
        // 일치
        Language cpp = Language.valueOf("CPP");
        System.out.println(cpp.getName());
    }
}
