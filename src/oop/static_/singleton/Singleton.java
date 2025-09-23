package oop.static_.singleton;

public class Singleton {

    // 외부에서 객체 생성할 수 없게 막아야함
    // 외부에서 이 클래스의 객체를 생성하지 못하도록 생성자를 단 하나만 선언하고, 그것을 private으로 가려버림

    // 2. 생성자를 호출할 수 있는 곳 -> 같은 클래스 내부 뿐
    // 스스로의 객체를 단 1개만 생성
    // 3. 에 static을 붙였으니 이걸 호출하고싶으면 이거도 Static 붙여야함
    // 여기에서 static을 붙이니까 getInstance가 아닌 s로 접근이 가능하니까 앞에
    // private를 붙임
    private static final Singleton s = new Singleton();

    public Singleton(){
        System.out.println("싱글톤 객체가 생성되었습니다.");
    }

    // 3. 외부에서 이 클래스의 객체를 요구할 때, 2번에서 미리 만들어 놓은
    // 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
    public static Singleton getInstance(){
        return s;
    }

    public void method1(){
        System.out.println("여러 클래스에서 사용하는 중요한 아티팩트");
    }

    public void method2(){
        System.out.println("프로그램 내에서 최소 한번씩은 호출해야하는 필수 메서드!!!");
    }
}
