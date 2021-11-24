package ch19.re;

public class Car {

    public static int serialNumber = 10000;
    private int carNumber;


    public Car() {
        serialNumber++;
        this.carNumber = serialNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

}
