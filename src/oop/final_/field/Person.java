package oop.final_.field;

public class Person {
    final String nation = "대한민국";
    // 속성 필드
    final String name;
    int age;


    // 2번째로 초기화법
    // 생성자에 넣어놨다는 것은 객체가 생성되자마자 해야할 일이 초기화라는 거 생성될 때 객체에 name 전달됨
    // final 필드는 불변의 값을 의미하기에 반드시 초기화가 되어야함
    // 초기화는 직접 해도 되고, 객체가 생성되자마자 생성자로 초기화 하는 것도 가능.
    public Person(String name) {
        // 이건 생성자로 초기화한거
        this.name = name;
    }


}
