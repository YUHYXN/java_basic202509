package oop.solid.lsp;

// 부모
public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    // 각각 셋팅할 수 있게 아래처럼 작성
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int getArea() {
        return width * height;
    }

}
