package oop.poly.car;

public class Driver extends Car{

    public void drive(Car c){
        System.out.println("운전을 시작합니다!");
        c.run();
    }

    // 리턴 타입을 부모타입으로 잡으면 자식타입의 객체를 리턴할 수 있다. (다형성)
    public Car buyCar(String name){
        if (name.equals("소나타")){
            System.out.println("소나타를 구입합니다.");
            return new Sonata();
        } else if (name.equals("테슬라")) {
            System.out.println("테슬라를 구입합니다.");
            return new Tesla();
        } else if (name.equals("포르쉐")) {
            System.out.println("포르쉐를 구입합니다.");
            return new Porsche();
        }
        return null;
    }


}
