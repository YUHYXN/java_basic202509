package oop.inter;

// BattleBot은 Controllable 인터페이스를 구현(implements) 규칙을 따르겠다 라는 뜻.
// 인터페이스는 다중 구현이 가능하다. || 전투 로봇은 Attackable 규칙도 따르겠다.
// 인터페이스는 하나에 담아서 호출하기보다 인터페이스 1개당 1파일씩 각각 만들어서 아래처럼 따로 호출해야한다.
public class BattleBot implements Controllable, Attackable{ // 다중 구현 가능
    @Override
    public void turnOn() {
        System.out.println("BattleBot 전원을 켭니다.(번쩍번쩍 금빛 안광이 일렁입니다,)");
    }

    @Override
    public void turnOff() {
        System.out.println("BattleBot 전원을 끕니다.(천천히 눈을 감고 고요히 잠이 듭니다.)");
    }

    @Override
    public void moveForward() {
        System.out.println("BattleBot이 씩씩하게 앞으로 이동합니다. (우당탕탕 쿵쿵쿵)");
    }

    @Override
    public void moveBackward() {
        System.out.println("BattleBot이 조심스럽게 뒤로 이동합니다. (삐걱삐걱 삐그덕삐그덕)");
    }

    @Override
    public void attack() {
        System.out.println("BattleBot이 공격합니다! (펑! 펑! 펑!)");
    }

    @Override
    public void parentMethod() {

    }
}
