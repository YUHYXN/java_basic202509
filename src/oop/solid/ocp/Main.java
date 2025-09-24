package oop.solid.ocp;

public class Main {

    public static void main(String[] args) {

        DiscountCalculator calc = new DiscountCalculator();

        long vipPrice = calc.calculateDiscount(new VipDiscountPolicy(), 100000);
    }
}
