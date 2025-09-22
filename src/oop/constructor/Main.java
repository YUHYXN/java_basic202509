package oop.constructor;

public class Main {

    public static void main(String[] args) {

        // 객체 생성
        Phone basic = new Phone();
        basic.showSpec();   // 스펙보기~
        // 생성자를 선언해두면 기본 값을 설정해둬서 좋다.
        System.out.println("===========================");
        Phone galaxy = new Phone("갤럭시S26");
        galaxy.showSpec();  // 갤럭시의 스펙을 보여주세요~
        System.out.println("===========================");
        Phone iPhone = new Phone("아이폰17프로","어쩌고 오렌지");
        iPhone.showSpec();


    }
}
