package oop.poly.player;

import oop.static_.utils.PrintUtil;

import static oop.static_.utils.PrintUtil.printLine;

public class Mage extends Player {

    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 100;
    }
    // 매개변수에 Player[] 을 지우고 ...targets 로 바꾸면
    // 가변인자 문법 (Variable Arguments)
    // Player[] targets = new Player[] {w1, w2, h1,
    // 콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 메서드 내부로 전달
    // (Player[] {w1,w2,w3} 이렇게 묶어서 전달하는 것과 동일한 효과)
    // 단, 가변인자는 메서드 내에서 배열로 취급됨
    public void blizzard(Player... targets){
        System.out.printf("%s님이 블리자드 시전!! \n", this.nickname);
        this.mana -= 30;
        System.out.printf("30의 마나가 소모됩니다. 남은 정신력: %d\n", this.mana);
        printLine();
        for (Player p : targets) {
            if (p == this) continue; // 자기 자신은 공격하지 않음 \\ 건너 뛰거나 실행되지 않음.

            // 데미지 랜덤하게 적용
            int damage = (int) (Math.random() * 6 + 10);
            // 0.0 <=(이상) x < 1.0(미만) 그래서 따로 곱하고 더하고 그래서 계산해야함 원하는 수를 한 번에 못함.
            // random() 은 double이라 int로 강제 형변환 해야함

            p.hp -= damage;
            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", p.nickname, damage, p.hp);
        }
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana: " + this.mana);
    }
}
