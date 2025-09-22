package oop.encap.good;

public class Main {

    public static void main(String[] args) {

        Mybirth my = new Mybirth();

        // setter 메서드를 통해서만 값을 설정할 수 있음
//        my.setYear(1993);
//        my.setMonth(7);
//        my.setDay(8);

        my.setYear(1992);
        my.setMonth(4);
        my.setDay(30);

        my.birthInfo();
    }
}
