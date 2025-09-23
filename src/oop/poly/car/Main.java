package oop.poly.car;

import oop.static_.utils.PrintUtil;

// static import : static 멤버(필드, 메서드)를 import 하는 기능
import static oop.static_.utils.PrintUtil.*;

public class Main {

    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();


        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();


        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();


//        Sonata[] sonatas = {s1, s2, s3};
//        for (Sonata sonata : sonatas) {
//            s.run();
//        }

        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car car : cars) {
            car.run();
        }

        // static_ utils PrintUtil 에 선언한 건데 불러와서 밑줄 칠 수 있다.
        // 위에 import static oop.static_.utils.PrintUtil.*; 해줘야 한다.
        printLine();

        Driver kim = new Driver();
        kim.drive(t3);
        kim.drive(p2);
        kim.drive(s1);

        printLine();

        Car myTesla = kim.buyCar("테슬라");
        myTesla.run();
        /*
		 - 다형성이 적용되면 자식 클래스의
		  본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		  (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)

		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
        // myTesla.activeAutopilot(); // 오류! Car 타입에는 activeAutopilot() 메서드가 없음
        // 부모 입장에선 자식 타입의 고유한 메서드에 접근할 수 없다.

        Tesla t5 = (Tesla) myTesla; // 부모 타입을 강제로 내린다.
        t5.activeAutopilot();

        // 출력하는 주소는 같음
        System.out.println(myTesla);
        System.out.println(t5);

        // Object 타입의 변수는 어떤 객체든 담을 수 있지만 객체의 고유 기능을 사용하려면
        // 원래의 타입으로 현변환이 필요하다. (객체가 2개 생성되는 것이 아님.)
        Object str = "메렁메렁";
        String s = (String) str;
        System.out.println(s.length());

        //다형성이 한 번도 발생하지 않은 경우엔, 형 변환을 진행 못한다.
        Car ccc = new Car();
//        Tesla ttt = (Tesla) ccc; // 오류! Car 객체는 Tesla 객체가 아니다. 본체는 Car
//        ttt.activeAutopilot();    // (x) -> 빨간 줄이 그어지지 않음 실행 안 됨
        // 어림없다

        printLine();

        CarShop carShop = new CarShop();
        carShop.carPrice(p2);
        carShop.carPrice(s1);
        carShop.carPrice(t4);


    }
}
