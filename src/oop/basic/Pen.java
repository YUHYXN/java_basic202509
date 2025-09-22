package oop.basic;

import java.sql.SQLOutput;

// 객체지향에 대한 기초 시작 20250922
// 객체 설계용 클래스에는 메인함수를 작성하지 않는다 main, psvm
public class Pen {

    // Pen이라는 객체의 속성을 표현한 것(변수로). -> 필드(멤버 변수)
    int price; // 가격
    String color; // 색상
    String penNo; // 펜번호

    // 객체의 기능을 표현한 함수 -> 메서드라고 부름. (객체가 동작하는 방법을 함수로 표현한게 메서드)
    // 함수는 동작을 실행하고 실핼 결과 값을 return 할 수 있는 기능이 있다.
    // 함수 이름 앞에 리턴 값 타입을 작성하는데, 돌려줄 값이 없으면 void라고 작성
    void write(){    // 함수를 불렀을 때, 기능을 할 것을 중괄호 안에 작성
        System.out.println(color + "색 펜으로 글을 씁니다.");
    }


    void penInfo(){
        System.out.println("제품 번호: " + penNo);
        System.out.println(color + "색 펜의 가격은" + price + "원 입니다.");
    }

}
