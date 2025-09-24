package oop.inter;

// '조종 가능한' 자격증
// 이 자격증을 따려면 아래에 명시한 모든 기능들을 반드시 만들어야 한다. (약속)
// 인터페이스들 끼리도 상속이 가능함 || 다중상속도 가능함 왜냐? 인터페이스는 구현의 내용이 없으니까
// Parent 인터페이스를 상속받아서 Controllable 인터페이스를 구현하는 클래스는 Parent의 기능도 구현해야함
public interface Controllable extends Parent {

    // 인터페이스에 변수를 선언하면 이걸 상수로 인식해서 글꼴이 기운다. static final로 인식함
    int num = 5;

//    public Controllable(){
//        인터페이스는 생성자를 가질 수 없다. -> 객체화 될 수 없는 개념
//    }


    // 인터페이스는 메서드 선언하면 추상 메서드로 지정된다.
    // 메서드의 내용도 들 수 없고 필드도 가질 수 없다.
    // 무조건 아래 이름의 기능이 있어야하며, 해당 이름이어야함.
    void turnOn(); // 추상 메서드 전원 켜기
    void turnOff(); // 추상 메서드 전원 끄기
    void moveForward(); // 추상 메서드 앞으로 이동
    void moveBackward(); // 추상 메서드 뒤로 이동
}
