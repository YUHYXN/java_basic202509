package oop.enum_;

public class Developer {

    // 정보 은닉으로 필드 구성해보자
    private  String name;
    private int career; // 경력
    private Language lang;
    // String lang; -> Language lang; 으로 바꿔주기 (열거형 타입으로 바꿔주기)


    // 컨트롤 + N 눌러서 setter, getter, 생성자 만들기
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }
}
