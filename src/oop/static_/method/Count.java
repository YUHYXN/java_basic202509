package oop.static_.method;

public class Count {

    public static  int b;
    public int a;

    public static void m2(){
        System.out.println("static method called!!");
//        System.out.println(a); // static 메서드에서는 인스턴스 멤버 사용 불가
        System.out.println(b);
//        System.out.println(this); // static 메서드에서는 객체 생성없이 호출 가능해서  this 사용 불가(this가 띌 주소가 없음)
    }

    // 인스턴스 메서드 : 객체별로 따로따로 행동하는 기능 -> 호출 시 객체 생성이 필수
    public void m1(){
        System.out.println("instance method called!!");
        System.out.println(a);
        System.out.println(b);
    }


}
