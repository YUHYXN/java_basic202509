package oop.poly.player;

import oop.static_.utils.PrintUtil;

public class Hunter extends Player{

    String pet;

    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
    }

    /*
    사냥꾼의 고유 기술인 magicArrow()를 완성해 주세요.
    타겟은 단일 타겟이고, 어떤 직업이든 매직 **우를 맞출 수 있습니다.

    각 직업별로 데미지가 다르게 들어갑니다.
    전사는 10, 마법사는 20, 사냥꾼은 15
    타겟의 직업이 무엇이냐에 따라 각각 다른 데미지를 적용해 주세요.
    %s가 %d의 피해를 입었고, 남은 체력은 얼마다 라는 정보도 출력해 주시고
    Main 클래스에서 메서드를 호출해 보세요.
     */

//    public void magicArrow(Player... targets){
//        System.out.printf("[%s]의 매직 애로우!!!\n", this.nickname);
//        for (Player p : targets) {
//            if (p == this) continue;
//
//            int damage = 10;
//            // 기본 데미지 전사
//            // 전사는 10, 마법사는 20 , 사냥꾼은 15
//            if (p instanceof Mage) {
//                damage = 20;
//            } else if (p instanceof Hunter) {
//                damage = 15;
//            }
//            p.hp -= damage;
//            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", p.nickname, damage, p.hp);
//
//        }
//    }

    // 강사님 코드
    public void magicArrow(Player target){
        System.out.printf("%s님이 %s님에게 매직 애로우를 시전합니다!\n"
        , this.nickname, target.nickname);

        // 다형성을 위해 직업은 String으로 저장
        int damage; String job;
        if(target instanceof Warrior){
            damage = 10;
            job = "전사";
        } else if (target instanceof  Mage) {
            damage = 20;
            job = "마법사";
        } else {
            damage = 15;
            job = "사냥꾼";
        }

        target.hp -= damage;
        System.out.printf("%님(%s)이 %d의 피해를 입었습니다.\n", target.nickname, job, damage);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickname, target.hp);
        System.out.println("-----------------------------------");

    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("pet = " + pet);
    }
}
