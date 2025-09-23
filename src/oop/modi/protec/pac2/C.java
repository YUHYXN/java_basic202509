package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

// A에게 상속을 한번.. 상속된다고 해도 protected, default 접근제한자는 다른 패키지에서 접근 불가
// 상속은 되었지만 접근 불가
public class C extends A{

    C(){ // 이렇게 C를 직접 열고는 확인 가능.
        this.m1();
        // this.m2(); // default : 다른 패키지에서 접근 불가
        this.f1 = 10;
        // this.f2 = 20; // default : 다른 패키지에서 접근 불

    }

    void test (){
        A a = new A();

        a.f1 = 10; // protected : 다른 패키지에서 접근 불가
        a.f2 = 20; // default : 다른 패키지에서 접근 불가
        a.m1();   // protected : 다른 패키지에서 접근 불가
        a.m2();   // default : 다른 패키지에서 접근 불가

        new A(10);    // protected : 다른 패키지에서 접근 불가
        new A("adadsda"); // default : 다른 패키지에서 접근 불가
    }
}
