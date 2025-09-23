package oop.static_.singleton;

public class Main {

    public static void main(String[] args) {

    // new singleton();
    // getInstance를 호출해야하는데
    // new Singleton(); 이게 안됨
    // private라서
    // Singleton s = new Singleton(); 이게 안됨
        // 객체가 없어서 안 불러짐.
        // 기능을 사용하려면 설계도 기반 객체가 있어야 한다 무조건.
        // 근데 객체를 못만드는데 기능을 어떻게 사용하는가?
        // public static Singleton getInstance() {}
        // static이 붙어있으니까 클래스 이름으로 바로 접근 가능

        Singleton s1 = Singleton.getInstance();
        s1.method1();
        s1.method2();

        // static을 선언 해놔서 객체 생성없이 s로 바로 접근 가능
        // 근데 이러지 않는 이유는 메서드로 접근하는게 더 안전하기 때문
        //예를 들어 s = null; 이런식으로 값이 바뀌는걸 막기 위해서





    }
}
