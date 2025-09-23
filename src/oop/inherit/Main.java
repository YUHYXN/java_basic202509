package oop.inherit;

// main 메서드 : 프로그램의 시작점 JVM이 가장 먼저 실행하는 메서드 얘도 Main.main(); 이런식으로 호출한다.
// 근데 얘가 static이 붙어있음. 얘는 객체 생성 없이 호출 가능
// main 메서드가 static이 붙어있는 이유는 main 메서드가 프로그램의 시작점이기 때문에
// main 메서드가 실행되기 전에 객체가 생성되어 있지 않을 수 있기 때문에 (( 그니까 메인이 실행되기 전에 뭐가 선언되어 있어야하냐? 그냥 스태틱 넣자)
// 그래서 main 메서드가 static이 붙어있음

public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("아델");

        w1.characterInfo();
        // 캐릭터인포는 인스턴스 메서드이기 때문에 객체 생성 후 호출 가능( Warrior w1 = new Warrior("아델"); 을 꼭 선언해서 담고해야함)


    }
}
