package oop.inherit;

public class Mage extends Player{

    int mana; // 마나 (마법사만 가지는 고유 속성)

    public Mage(String nickname, int mana) {
        super(nickname);
        this.mana = mana;
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana: " + this.mana);
    }
}
