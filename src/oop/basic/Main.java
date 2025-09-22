package oop.basic;

public class Main {
    public static void main(String[] args) {

        /*
        * 설계도에 작성된 속성과 기능을 사용하려면
        * 반드시 실체(객체)가 있어야 합니다.
        * 설계도 만으로는 아무것도 할 수 없습니다.*/

        // new 연산자는 새로운 객체를 생성할 때 사용
        //객체 생성 문법: 클래스타입 변수명 = new 클래스이름();
        Pen redPen = new Pen();
        Pen bluePen = new Pen();

        // Pen() -> 생성자(Constructor)라고 부름. (클래스 이름과 동일하게 작성)
        // 클래스 타입은 Pen 이다. (객체)
        // Pen 클래스 기반으로 변수를 준 것 둘 다 클래스타입도 Pen이다.


        // 객체로 접근 한 후 속성과 기능을 사용해보자
        // 배열은 각 주소가 있는데 각 주소마다 Pen 객체가 들어갈 수 있다. 주소가 있다는 것임
       // 변수에 있는 주소 값으로 객체에 접근한다.
        // 주소 값을 참조한다해서 [참조 연산자]를 사용한다. (함수 뒤에 . 찍는 것 = 거기로 찾아가겠다.)

        // 각 객체를 담고있는 변수들

        redPen.price = 500;
        redPen.color = "빨강";
        redPen.penNo = "A001";

        bluePen.price = 600;
        bluePen.color = "파랑";
        bluePen.penNo = "A002";

        redPen.write(); // redPen 주소를 보고 객체를 찾아가서 redPen 값이 가진 값에 맞게 write() 메서드 호출
        bluePen.write();

        redPen.penInfo();   // Pen.java에 있는 penInfo() 메서드 호출
        bluePen.penInfo();

        //주소 값을 담은 [객체 이름]만 구분해주면, 설계가 다 되어있어서 편함
        // 얼마든지 같은 기능의 객체를 찍어내는 것이 가능함.

    }
}
