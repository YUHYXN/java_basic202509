package oop.poly;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
/*
          Object
            |
            A
         /    \
        B     C
        |     |
        D     E
 */
// 다중상속의 대표적인 문제 중 하나, 데스 다이아몬드
// 근데 자바는 다중상속이 안되니까 걱정 ㄴㄴ

public class Basic {

    void test(){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 자식은 하위 클래스라고 부르고 부모는 상위 클래스라고도 부른다.
//        A v1 = new B(); // 다형성이 이거임 B는 A의 자식이니까 가능
//        C v1 new A(); // 안됨, A는 C의 부모가 아님

        Object o1 = new A();
        Object o2 = new B();
        Object o3 = new C();
        Object o4 = new D();
        Object o5 = new E();
        // Object는 모든 클래스의 최상위 부모이므로 다 가능

    }

}
