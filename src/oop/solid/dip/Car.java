package oop.solid.dip;

public class Car {
    private final Tire forntLeft;
    private final Tire forntRight;
    private final Tire backLeft;
    private final Tire backRight;

    public Car(Tire forntLeft, Tire forntRight, Tire backLeft, Tire backRight) {
        this.forntLeft = forntLeft;
        this.forntRight = forntRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    public void drive() {
        forntLeft.roll();
        forntRight.roll();
        backLeft.roll();
        backRight.roll();
    }
}
