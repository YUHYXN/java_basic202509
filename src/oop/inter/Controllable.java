package oop.inter;

// '조종 가능한' 자격증
// 이 자격증을 따려면 아래에 명시한 모든 기능들을 반드시 만들어야 한다. (약속)
public interface Controllable {

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
    void moveLeft(); // 추상 메서드 왼쪽으로 이동
    void moveRight(); // 추상 메서드 오른쪽으로 이동

}
