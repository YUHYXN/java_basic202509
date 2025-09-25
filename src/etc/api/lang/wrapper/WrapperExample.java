package etc.api.lang.wrapper;

public class WrapperExample {
    public static void main(String[] args) {

        // 기본형 타입을 객체로 다루어야 할 때 사용하는 클래스
        int a = 100;
        boolean b = false;
        char c = 'a';
        double d = 1.0;

        // 컬렉션에 기본타입을 객체를 포장해서 넣어야할 때
        // boxing : 기본타입 -> 객체타입 변환
        // Integer v1 = new Integer(a); // deprecated
        // Boolean v2 = new Boolean(b); // deprecated
        // Character v3 = new Character(c); // deprecated
        // Double v4 = new Double(d); // deprecated

        //autoboxing : 기본타입 -> 객체타입 변환을 자동으로 해줌
        Integer v1 = a;
        Boolean v2 = b;
        Character v3 = c;   // 얘만 단일문자로 바꾸는게 없음
        Double v4 = d;

        // 객체로 포장된 타입을 기본 타입으로 변환
        // unboxing : 객체타입 -> 기본타입 변환
        // int i = v1.intValue(); // deprecated
        // boolean j = v2.booleanValue(); // deprecated
        // char k = v3.charValue(); // deprecated
        // double l = v4.doubleValue(); // deprecated

        // auto unboxing : 객체타입 -> 기본타입 변환을 자동으로 해줌
        int i = v1;
        boolean j = v2;
        char k = v3;
        double l = v4;


    }
}
