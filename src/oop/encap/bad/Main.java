package oop.encap.bad;

public class Main {

    public static void main(String[] args) {

        Mybirth my = new Mybirth();

        // 외부에서 필드에 직접 접근하여 값 설정 가능 -> 잘못된 데이터도 저장 가능
//        my.year = 1993;

    }
}
