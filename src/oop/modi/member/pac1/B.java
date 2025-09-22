package oop.modi.member.pac1;

public class B {

    void test(){
        A a1 = new A(50); // public
        A a2 = new A(5.55); // default
//        A a3 = new A(true); // private - 같은 패키지라도 다른 클래스에서는 접근 불가


        a1.f1 = 20; // public
        a2.f2 = 30; // default
//        a1.f3 = 40; // private - 같은 패키지라도 다른

        a1.m1();
        a2.m2();
//        a1.m3(); // private - 같은 패키지라도 다른 클래스에서는 접근 불가
    }
}
