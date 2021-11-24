package ch19;

public class Car {

    private static int serialNumber = 10000;
    private int carNum;
    private String carName;

    public Car() {
        serialNumber++;
        carNum = serialNumber;

    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = serialNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


}
