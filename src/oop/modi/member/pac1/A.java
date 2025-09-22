package oop.modi.member.pac1;

public class A {

    // 필드 생성자 메서드 한 번에 보기

    // 필드
    public int f1;
    int f2; //아무것도 주지 않으면 default
    private int f3;

    // 생성자
    // 생성자 중복 선언하려면 오버로딩 필요 (매개변수의 타입, 개수, 순서 중 하나 이상이 달라야 함)
    public A(int a){}
    A(double d){}
    private A(boolean b){}

    // 메서드
    public void m1(){}
    void m2(){}
    private void m3(){}


    void test(){
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;
        // 같은 클래스 내에서는 private 접근 가능 문제없음
        this.m1();
        this.m2();
        this.m3();

        new A(10);
        new A(3.14);
        new A(true);

    }


}
