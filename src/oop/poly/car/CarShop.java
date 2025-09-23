package oop.poly.car;

public class CarShop {
    /*
        Mammals
           |
         Person
           |
        Student

        Mammals m = new Student();
        m instanceof Person -> true
     */

    public void carPrice(Car c){
        if (c instanceof Sonata){   // 좌항에 있는 객체가 우항에 있는 객체의 타입을 가질 수 있느냐? 가질 수 있으면 true;
            System.out.println("소나타의 가격은 3248만원 입니다.");
        }else if(c instanceof Tesla){
            System.out.println("테슬라의 가격은 9000만원 입니다.");
        }else {
            System.out.println("포르쉐의 가격은 2억 4천8백만원 입니다.");
        }
    }
}
