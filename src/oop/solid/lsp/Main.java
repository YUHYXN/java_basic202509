package oop.solid.lsp;

public class Main {

    public static void main(String[] args) {

        testArea(new Rectangle(10, 5));  // width , height 미리 세팅
        testArea(new Square(10));

    }

    public static void testArea(Shape r){

        // 만약 메서드에서 두 도형이 모두 필요하다면, 매개변수의 타입을 Shape으로 통일
        // Rectangole은 본인 전용 메서드로 유효성 판단하고
        // Square는 본인 전용 메서드로 유효성 판단한다

        // getArea()의 기대값은 50 이어야 하는데 Square가 오면 25가 나옴
        // getArea가 50과 같지 않다면
        if (r.getArea() != 50){
            System.out.println("계산 오류! 기대값: 50, 실제값: " + r.getArea());
        }else {
            System.out.println("계산 정상");
        }
        // 위의 경우 정사각형이 들어가면 오류남 5*5 = 25
        // LSP 위반 상속으로 구현한 것 자체가 문제임
        // 상속은 너무 강하게 결합 됨 || 이 문제를 인터페이스로 해결해본다
    }
}
