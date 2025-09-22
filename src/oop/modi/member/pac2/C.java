package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

    void test(){
        A a1 = new A(50); // public
//        A a2 = new A(2.34); // default - 다른 패키지에서는 접근 불가
//        A a3 = new A(false); // private - 다른 패키지에서는 접근

        a1.f1 = 20; // public
//        a1.f2 = 30; // default - 다른 패키지에서는 접근 불가
//        a1.f3 = 40; // private - 다른 패키지에서는 접근 불가

        a1.m1();
//        a1.m2(); // default - 다른 패키지에서는 접근 불가
//        a1.m3(); // private - 다른 패키지에서는 접근 불가

    }
}
