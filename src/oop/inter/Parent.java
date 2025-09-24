package oop.inter;

// 인터페이스도 부모를 만들어서 상속 시킬 수 있다.
// 인터페이스들 끼리도 상속이 가능함 || 다중상속도 가능함 왜냐? 인터페이스는 구현의 내용이 없으니까
// Parent 인터페이스를 상속받아서 Controllable 인터페이스를 구현하는 클래스는 Parent의 기능도 구현해야함
public interface Parent {

    void parentMethod(); // 나는 부모다.


}
