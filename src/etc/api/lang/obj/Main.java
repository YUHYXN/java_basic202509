package etc.api.lang.obj;

public class Main {

    public static void main(String[] args) {
        Person kim = new Person("김춘식", 30);
        Person hong = new Person("김춘식", 30);

        System.out.println("kim = " + kim); // kim.toString()이 생략 되어있다.
        System.out.println("hong = " + hong);
        // 나중에 주소값 볼 일이 없음

//        System.out.println(kim == hong);
        System.out.println(kim.equals(hong));   // Obhject의 equals() 메서드라서 사용 가능함

        // equals에서 동등한 객체라고 판명이 되었다면, 서로 다른 객체더라도
        // 객체의 고유한 주소를 동일하게 처리해서 서로 같은 객체임을 명확히 해야 합니다.
        // 그래야, 자바에서 기본으로 제공하는 클래스 중에 hash를 비교해서 동등 객체인지 아닌지를
        // 판별하는 자료구조(HashSet, HashMap)들이 정상적으로 동작할 수 있습니다.
        System.out.println(kim.hashCode());
        System.out.println(hong.hashCode());

        Person park = new Person("박영희", 100);
        try {
            Person clonePerson = (Person) park.clone(); // Person 강제 형 변환
            System.out.println("clonePerson = " + clonePerson);
            System.out.println(park == clonePerson);    // 주소가 다르다 별개의 객채로 만들어짐
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();    // 클론되지 않았을 때 예외가 발생할 수 있음.
        }

    }

}
