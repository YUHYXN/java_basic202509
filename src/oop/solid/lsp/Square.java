package oop.solid.lsp;

public class Square implements Shape {

    // 나만의 그걸 만들어
    private final int sideLength; // 정사각형은 한 변의 길이만 있으면 된다.

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }

}
