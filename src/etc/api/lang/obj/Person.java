package etc.api.lang.obj;

import java.util.Objects;

// clone 메서드를 오버라이딩 했다면 cloneable 인터페이스를 구현해야 한다.
// cloneable 인터페이스를 구현하지 않으면 clone 메서드 호출 시 예외가 발생한다.
public class Person implements Cloneable{

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() : 객체의 문자열 표현을 반환하는 메서드
    // Object가 물려주는 toString은 패키지 + 클래스이름 + 주소값 -> 쓸 일이 잘 없다.
    // 그래서 대부분 오버라이딩 해서 사용한다.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + "세" +
                '}';
    }



    @Override
    public boolean equals(Object obj) { // 오버라이드는 매개변수 타입을 바꿀 순 없음 앞에꺼.
      if (this == obj) return true; // 주소값이 같으면 같은 객체야
        if (obj instanceof Person p) {   // 혹시 obj가 Person 타입이니?
            return p.age == this.age && p.name.equals(this.name); // obj가 Person 타입이 맞으면 name, age가 같은지 비교
//            if (p.name == this.age && p.name.equals(this.name)) return true; 이렇게 해도 됨
        }
        return false; // obj가 Person 타입이 아니면 다른 객체야
    }

    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    protected void finalize() throws Throwable {
        // 생성된 객체가 소멸할 때 자동으로 호출되는 메서드
        // garbage collector가 호출되는 순서를 보장할 수 없기에 사용을 권장하지 않음
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
