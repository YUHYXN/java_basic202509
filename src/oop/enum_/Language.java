package oop.enum_;

public enum Language {
    // 상수니까 대문자
    JAVA("자바", true), PYTHON("파이썬",true), CPP("C++", true), JAVASCRIPT("자바스크립트", false);

    // 상수와 연관 시킬 데이터를 담을 필드를 선언할 수 있다.
    private final String name;
    private final boolean isCompileLang;

    // 생성자도 만들 수 있다.
    // 외부에서 enum 타입의 상수를 참조하면 enum 객체가 생성된다.
    // 위 상수에 선언한 방식의 생성자 호출문을 통해 연관 데이터가 매개값으로 전달되며 필드가 초기화.
    Language(String name, boolean isCompileLang) {
        this.name = name;
        this.isCompileLang = isCompileLang;
    }

    public String getName() {
        return name;
    }

    //boolean 타입의 getter 이름은 is로 시작하는게 관례
    public boolean isCompileLang() {
        return isCompileLang;
    }
}
