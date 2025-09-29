package oop.static_.field;

public class Main {

    public static void main(String[] args) {
        Count c1 = new Count();

        c1.a += 5;  //c1에 접근해서 a에 누적해서 5를 더해라
        Count.b += 5;  //c1에 접근해서 a에 누적해서 5를 더해라

        System.out.println("c1.a: " + c1.a);
        System.out.println("c1.b: " + Count.b);

        System.out.println("-------------------");

        Count c2 = new Count(); //   c2라는 새로운 객체를 생성함.

        c2.a += 7;
        Count.b += 7;

        System.out.println("c2.a: " + c2.a);
        System.out.println("c2.b: " + Count.b);

        Count c3 = new Count();

        c3.a += 8;
        Count.b += 8;

        System.out.println("c3.a: " + c3.a);
        System.out.println("c3.b: " + Count.b);
        System.out.println("c1.b: " + Count.b);
        System.out.println("c2.b: " + Count.b);

        // 값이 누적되는 걸로 표기되는데 이게  static 변수가 그냥 누적되는게 아니다
        // static 변수는 하나의 값만 존재한다.
        // c1, c2, c3 모두 Count.b를 공유하고 있는 것이다. 왜 Count 전체를 공유해?
        // 왜 공유해 ? 메모리 절약하려고 주소 접근했다가 데이터에 올라와 있는 숫자를 가져와서 더한거임. 초단순

        /*
         - static이 붙은 데이터는 그 static 데이터가 선언된
          클래스의 이름으로 바로 참조할 수 있습니다.
         - 일반 멤버변수(필드)와 혼동할 가능성이 있기 때문에
          주소값으로 접근하지 않습니다.
         */

        Count.b++;

        System.out.println("==============================");





    }
}
