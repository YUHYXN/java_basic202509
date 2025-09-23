package oop.final_.method;

public class Child extends Parent {
    // Parent를 public final class로 만들면 상속 불가

    // 오버라이딩 시작


    @Override
    void method1() {
        super.method1();
    }

    @Override
    void method2() {
        super.method2();
    }

//    void method3() {} // final 메서드는 오버라이딩 불가
}
