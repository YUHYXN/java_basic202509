package oop.fieldlocal;

public class Main {
    public static void main(String[] args) {
        new Person(); // 객체 생성

        Person kim = new Person();
        Person kang = new Person();

        kim.name = "김나무";
        kim.age = 29;

        String hello = kim.hello("한국");
        // hello(); 를 호춣했으니 "안녕하세요!" 라는 글자를 불러온거랑 똑같다.
        // 메서드를 호출했을 때 리턴값이 있다면, 메서드를 호출한 곳으로 리턴된다.
        // 그 리턴된 값은 변수에 담아서 할당하거나, 바로 출력도 가능하다.

//        System.out.println("i의 값: " + i); // i는 hello() 메서드 안에서만 쓸 수 있는 지역변수이기 때문에 에러남

        // 변수 값 출력 soutv
        System.out.println("hello = " + hello);
        // hello 에 안녕하세요! 가 들어있다는 걸 확인할 수 있음

        System.out.println(hello == "안녕하세요!"); // true

        String s = "안녕하세요!";
        // String s = "안녕하세요!"; // 이거랑 똑같음 \\ new String() 는 굳이 불필요
        System.out.println(s == hello);
        // 주소가 다르기 때문에 false가 맞는데 왜 true가 나오지?
        // 안녕하세요! 를 같은거로 보기 때문에 원래 주소가 다른데 같다고 나옴
        // 그래서 문자열을 비교할 때 == 을 쓰면 안 됨 위험함 변수에 있는 값을 자꾸 비교하려고함
        // 그래서 문자열 비교할 때는 .equals() 메서드를 사용해야 함
        System.out.println(s.equals(hello)); // true (값을 비교) s.(랑)비교하기(hello) 이런 느낌
        // s 와 hello 가 같은 값을 가지고 있기 때문에 true 가 나옴
        // .equals() 메서드는 문자열 값을 비교하는 메서드
        // .equals() 메서드는 문자열 값이 같으면 true, 다르면 false 를 리턴한다.
        // 각각 배열을 가져와서 char[] 형태로 바꾼 다음에 index 단일문자 하나하나 전부다 비교하는 것
        // 그래서 한 번이라도 false가 나오면 전부다 false가 나오는 것
        // 그래서 문자열 비교할 때는 무조건 .equals() 메서드를 사용해야 한다

        // String \ constant \ pool 일단 얘네는 쌍따옴표 "" 로 감싸진 문자열은
        // constant pool 이라는 메모리 공간에 저장이 된다. (쌩 문자열)
        // 그래서 hello 와 s 는 같은 값을 가지고 있지만, 다른 메모리 공간에 저장이 되어있기 때문에
        // == 비교 연산자로 비교하면 false 가 나오는 것


    }
}
