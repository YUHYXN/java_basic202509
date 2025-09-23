package oop.final_.constans;

public class Earth {
    // 상수는 고정된 불변의 값이다.
    // double radius; // 반지름 지구의 반지름은 6371km | 약 6400km
    // 뒤에 radius 는 그럼 static한 느낌과 final한 느낌이 있는거임
    // 그럼 초기화 해줘야겠지?
    static final double RADIUS = 6400.0; // 상수는 대문자로 작성하는게 관례이자 규칙!

    // 대문자로 해야하는데, 아래는 두 단어가 들어가서 예외적으로 스네이크 케이스로 작성
    /*final field는 직접 때려서 초기화하거나, 생성자를 통해서 초기화 할 수 있음.
     * static은 객체를 생성하지 않고 불러올 수 있는데
     * static한 final은 생성자로 초기화할 수 없음 왜냐면
     * 객체를 안 만들어도 사용할 수 있어야 하기 때문이다.*/

    static final double SURFACE_AREA; // 상수는 선언과 동시에 초기화 해야함

    static{
        // 정적 초기화자 (static initializer)
        // 정벽 변수 등을 자동으로 초기화 해주는 static 블록이다. (이름없음)
        // 정적 초기화자는 내가 호출하는게 아니라 클래스가 로딩되면 자동으로 호출됨
        // 객체가 생성되면 로딩 됨. \\ 정적 초기화자는 클래스 로딩 시, 최초 1회만 호출된다.

        SURFACE_AREA = 4 * Math.pow(RADIUS, 2) * Math.PI;
        // pow는 static 메서드이기 때문에 Math. 찍어서 사용
        // RADIUS * RADIUS를 Math.pow(RADIUS, 2)로 표현 가능
        // pow() 안에는 double 타입만 들어갈 수 있음


    }



}
