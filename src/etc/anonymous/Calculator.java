package etc.anonymous;


@FunctionalInterface
public interface Calculator {

    // 계산기능 명세
    int operate(int a, int b); // 추상 메서드

//    void method1();   // 추상 메서드 // -> 추상 메서드가 2개 이상이면 람다식 사용 불가


}
