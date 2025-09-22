package oop.this_;

public class Player {

    // 필드 선언
    String nickname;
    int level;
    int hp;


    // 생성자 선언

    public Player() {
        System.out.println("기본 생성자 호출!");
        this.level = 1;
        this.hp = 50;
    }

    // 생성자 자동 생성 단축키 : 컨트롤 + n
    public Player(String nickname) {
        // 여기에 작성해야함 대신 해달라고 하려면
        this(); // 같은 클래스 내에 다른 생성자를 호출하는 문법.
        System.out.println("2번 생성자 호출!");
        this.nickname = nickname;
        // 레벨이랑 피통을 기본 생성자 호출에게 대신 해달라고 해보자
    }
    // 필드 이름이랑 매개변수 이름이랑 같을 때 this.필드이름 그래도 잘 찾아준다.


    public Player(int hp, String nickname) {
        this(nickname); // 항상 첫 구문이어야함 규칙임
        System.out.println("3번 생성자 호출!");
        this.hp = hp;

    }

    // 메서드 선언
    void characterInfo() {
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("닉네임: " + this.nickname);
        System.out.println("레벨: " + this.level);
        System.out.println("체력: " + this.hp);
    }

}
