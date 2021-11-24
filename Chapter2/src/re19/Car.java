package re19;

public class Car {
    private static int serialNumber = 10000;
    private int carNumber;

    public Car() {
        this.carNumber = serialNumber++;
    }

    public int getCarNum() {
        return carNumber;
    }

}
