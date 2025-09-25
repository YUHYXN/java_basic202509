package etc.inner;

public class Car {

    private static final int establishedYear = 2025;
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    // 주유 가능
    public void refuel(int amount) {
       this.fuel += amount;
        System.out.println("주유 후 현재 연료: " + fuel);
    }

    // 지역 내부 클래스
    // 일회용 도우미 (drive가 호출되면 그때에만 로직을 처리하는 용도의 클래스를 만들고싶다.)
    public void drive(int distance){
        System.out.println(" >>" + distance + "km 운전합니다.");

        // 메서드 안에서만 정의되고 사용하는 클래스
        class TripLog{
            private final String tripName;

            public TripLog(String tripName) {
                this.tripName = tripName;
            }

            public void log(){
                System.out.println(tripName + "여행 기록(지역내부클래스): 총 " + distance + "km");
                System.out.println("연료량: " + fuel + "L");
            }
        }

        // drive 메서드 안에서만 사용 가능
        TripLog logger = new TripLog("부산");
        logger.log();
    }

    // 정적 내부 클래스 (Static Inner Class)
    public static class TireSpec{

        public void printInfo(){
            System.out.println(" >> 타이어 정보를 확인 합니다. (정적 내부 클래스");
            // static 멤버는 사용 가능
            System.out.println("제조연도: " + establishedYear); // 정적 내부 클래스에서는 바깥쪽 클래스의 정적 필드에만 접근 가능

            // static클래스는 바깥의 멤버를 참조할 수 없습니다.
//                System.out.println("현재 연료: " + fuel); // 정적 내부 클래스에서는 바깥쪽 클래스의 인스턴스 필드에 접근 불가

        }
    }

    // 인스턴스 내부 클래스
    // Car class의 내부 클래스이다.
    public class Engine{
        public void start(){
            System.out.println("시동을 켭니다.(인스턴스 내부 클래스) 현재 연료: " + fuel + "L");
            // 바깥쪽 클래스의 private 필드에 자유롭게 접근 가능! (강하게 결합 됨)
            if (fuel > 0){
                System.out.println("끼긱끼긱끼긱끽...끽....ㅂ...부.....부릉~");
                fuel -= 5;
            }else {
                System.out.println("연료가 부족합니다. 주유를 해주세요.");
            }
        }
    }


}
