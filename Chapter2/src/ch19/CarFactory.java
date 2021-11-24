package ch19;

public class CarFactory {

    private static CarFactory instace = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        return instace;
    }

    public Car createCar() {

        return new Car();
    }


}
