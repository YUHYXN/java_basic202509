package oop.solid.dip;

public class Car {
    private Tire forntLeft;
    private Tire forntRight;
    private Tire backLeft;
    private Tire backRight;

    public Car(Tire hankookTire, Tire hankookTire1, Tire michelinTire, Tire michelinTire1) {
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
