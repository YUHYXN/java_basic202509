package oop.overloading;

public class Calculator {
    //오버로딩이란 중복선언 -> 생성자에도 가능하고 메서드에도 가능하다.
    //오버 로딩은 매개 변수(파라미터)로 오버로딩을 조정 가능 -> 매개변수의 개수,순서,데이터 타입 세 가지 중 하나만 다르게 하더라도 오버로딩 인정

    int add(int n1, int n2){
        return n1 + n2;
        // int + int = int 그래서 리턴 타입은 int다
    }

    int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
        // int + int + int = int 그래서 리턴 타입은 int다
        // 얘네가 add로 이름이 똑같을 수 있는 이유는 매개변수의 개수가 다르기 때문이다.
        // 즉, 시그니처가 다르기 때문에 가능하다.
    }

    void method1(){}
    void method1(int i){}
    void method1(String s){}
    void method1(int i, double d){}
    // 정수 실수 순서로 호출하면 실수가 호출되고,
    void method1(double d, int i){}
    // 실수 정수 순서로 호출하면 정수가 호출된다.
    // 그래서 시그니처가 다르기 때문에 오버로딩이 가능하다.

    int calcArea(int h){    // 한 변의 길이가 왔다 h
        return h * h /2;
        // 정사각형의 넓이 = 한 변의 길이 * 한 변의 길이 / 2
    }

    int calcArea(int w, int h){  // 가로 세로 길이가 왔다 w, h
        return w * h;
        // 직사각형의 넓이 = 가로 길이 * 세로 길이
    }

    // 리턴 타입은 오버로딩과 연관 없음!!!
    // 매개 변수로만 가능.
    double calcArea(int f, int c, int h){
        return (double) (f * c) * h / 2;
        // 사다리꼴의 넓이 = (윗변 + 아랫변) * 높이 / 2

    }

}
