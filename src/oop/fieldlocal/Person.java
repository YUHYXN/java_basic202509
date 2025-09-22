package oop.fieldlocal;

import java.sql.SQLOutput;

public class Person {

    String name;    //  필드(속성, 멤버변수)
    int age;    //  필드(속성, 멤버변수)

//    String hello(){ // 기능 메서드에서 hello는 문자 값을 돌려주니까 앞에 클래스 타입은 String
//        System.out.println(name + "이(가) 인사합니다.");
//        return "안녕하세요!";
//    }


    // 아 근데 그냥 hello는 심심하다?
    String hello(String country){ // 매개변수(파라미터) -> 메서드를 호출할 때 전달해야 하는 값.
        int i = 30;
        System.out.println("i의 값: " + i);

        System.out.println(name + "이(가) 인사합니다.");
        if(country.equals("한국")){
            return "안녕하세요!";
        } else if (country.equals("미국")) {
            return "hello!";
        } else if (country.equals("일본")) {
            return "곤니찌와!";
        }else {
            // 만약 리턴 타입을 String이라고 작성했으면
            // 어떤 상황에서도 이 메서드는 문자열을 리턴해야 한다. (이건 그냥 약속임) 안 그러면 메서드를 쓰다 만거임
            return "그 나라 인사는 모르겠는데요...";
        }

    }
}
