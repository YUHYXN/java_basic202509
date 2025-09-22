package oop.modi.cls.pac2;


import oop.modi.cls.pac1.B; // public 클래스는 다른 패키지에서 import 가능

public class C {
    // pac1 패키지에 있는 A, B 클래스를 사용해보자!
    // A a = new A(); // default 클래스는 다른 패키지에서 접근 불가
    // B b = new B(); // public 클래스는 다른 패키지에서 접근 가능
    // 클래스에 프라이빗을 붙일 수 없다.
    // A a = new A(); // default 클래스는 다른 패키지에서 접근 불가
    B b = new B();

}
