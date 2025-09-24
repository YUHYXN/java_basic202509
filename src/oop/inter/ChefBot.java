package oop.inter;

public class ChefBot implements Controllable, Cookable {
    @Override
    public void cook(String menu) {
        System.out.println("ChefBot이 " + menu + "을(를) 요리합니다! (맛있는 냄새가 솔솔~)");
    }

    @Override
    public void turnOn() {
        System.out.println("ChefBot 전원을 켭니다.(어디선가 맛있는 냄새가 납니다.)");
    }

    @Override
    public void turnOff() {
        System.out.println("ChefBot 전원을 끕니다.(식재료를 정리하고 조용히 잠이 듭니다.)");
    }

    @Override
    public void moveForward() {
        System.out.println("ChefBot이 부지런히 앞으로 이동합니다. (싹싹김치하는 소리가 들립니다.)");
    }

    @Override
    public void moveBackward() {
        System.out.println("ChefBot이 조심스럽게 뒤로 이동합니다. (썩썩김치하는 소리가 들립니다.)");
    }

    @Override
    public void parentMethod() {

    }
}
