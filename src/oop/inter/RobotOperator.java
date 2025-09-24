package oop.inter;

public class RobotOperator {

    public static void main(String[] args) {
        // 로봇 오퍼레이터가 있어야함

        RobotOperator operator = new RobotOperator();

        operator.testRobot(new BattleBot());    // 전투로봇 테스트 || Attack이 가능

        operator.testRobot(new ChefBot());      // 요리로봇 테스트 || Cook이 가능

        // 나중에 청소 로봇이 추가된다 해도, testRobot 메서드는 수정할 필요가 없다.
        // 다형성의 장점 중 하나 : 유지보수성 증가

        operator.testRobot(new BattleBot());
        operator.testRobot(new ChefBot());

        // 이런식으로도
        Controllable[] arr = {new BattleBot(), new ChefBot()};

        // **** 추상클래스(부모 자식이 모든걸 물려줄 수 있음) -> 상속(단일상속이 원칙)
        // **** 인터페이스(규칙 || 아무 내용도 전달하지 않음) -> 구현(체)(implements)
    }

    // Bot을 매개변수로 받고싶은데 두개 다 어케받냐? -> 인터페이스로 받자 -> 다형성
    // 인터페이스 구현 타입으로도 다형성 발생이 가능하다.
    public void testRobot(Controllable robot){
        System.out.println("** 안드로이드 작동 테스트를 시작합니다 ***");
        robot.turnOn();
        robot.moveForward();
        robot.moveBackward();
        robot.turnOff();
        System.out.println("** 안드로이드 작동 테스트를 종료합니다 ***");
    }

    // 전투기능 테스트
    public void testRobotAttack(Attackable robot){
        robot.attack();
    }

    // 요리기능 테스트
    public void testRobotCook(Cookable robot, String menu){
        robot.cook("김치라면");
    }
}
