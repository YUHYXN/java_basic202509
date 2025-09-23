package oop.abs;

public class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        // 부모의 생성자가 특정 매개 값을 받는 생성자 밖에 없다면, 자식 생성자에서도 반드시 특정 매개 값을 전달하는
        // super() 생성자 호출 구문이 있어야 한다.
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatorArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * Math.PI * radius;
    }
}
