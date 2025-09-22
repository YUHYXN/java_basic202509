package oop.constructor;

public class Phone {

    String model;
    String color;
    int price;

    // 자동으로 객체가 생성되게끔.. 생성자 선언!
    // 메서드 선언과 다른 점은 리턴 타입이 없음 (void, int, String 등등.. Phone 앞에 붙는게 없음)
    // 생성자는 객체를 생성하는데 집중 되어있음.
    Phone(){
        System.out.println("기본 생성자 호출!!");
        model = "스맛폰";
        color = "흰색";
        price = 100000;

    }

    // 생성자 오버로딩 (중복선언)
    Phone(String pModel){
        System.out.println("2번 생성자 호출!");
        model = pModel;
        color = "검정색";
        price = 1000000;
    }

    Phone(String pModel, String pColor){
        // 나는 폰 모델도 받고, 컬러도 받아.
        System.out.println("3번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = 1290000;
    }

    /*
	 # 생성자 (Constructor)

	 1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
	  클래스 내부에 반드시 하나 이상 존재해야 합니다.

	 2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로
	  매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
	  (default constructor)를 하나 만들어 줍니다.

	 3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
	  작성하여 선언하고, 리턴 타입이 존재하지 않습니다.

	 4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
	  기술할 수 있습니다.
	 */






    void showSpec(){
        System.out.println("*** 휴대폰 정보 ***");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price + "원");
    }
}
