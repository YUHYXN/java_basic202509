package oop.inherit;

/*
	# 부모 클래스, 상위 클래스 (Parent, super class)

	- 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
	- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
	 멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/
public class Player {

    // 여기에 적는다는 것은, 모든 플레이어들에게 동일하게 상속되어야 하는 내용이라 그럼

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

    // 일반 메서드
    // 공격
    void attack(Player target){
        if (target == this){ // 자기 자신을 공격하는 상황 방지
            System.out.println("타겟이 잘못되었습니다!");
            return;
            // 메서드 종료
        }

        // 포맷팅 방식 먼저 채우고 문자열을 나열해줌
        System.out.printf("%s님이 %s님을 공격합니다!\n", this.nickname, target.nickname);

        // 맞는 play의 체력을 10 감소 시키고, 때리는 player의 체력은 3 감소 시킨다.
        this.hp -= 3; // this.hp = this.hp - 3;
        target.hp -= 10; // target.hp = target.hp - 10;

        System.out.printf("%s님의 남은 체력: %d\n", this.nickname, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickname, target.hp);

    }


    // 메서드 선언 -- 모든 캐릭터들이 동일하게 가져야하는 내용
    void characterInfo() {
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("닉네임: " + this.nickname);
        System.out.println("레벨: " + this.level);
        System.out.println("체력: " + this.hp);
    }

}
