package ch15.re;

public class reTest {
    public static void main(String[] args) {

        Student Lee = new Student("Lee", 10000);
        Student Kim = new Student("Kim", 20000);

        Taxi taxi = Taxi.getInstance();
        taxi.setName("한대택시");
        Bus bus = Bus.getInstance();
        bus.setName("버스한대");

        Lee.takeTaxi(taxi);
        Kim.takeBUs(bus);

        Kim.showInfo();
        Lee.showInfo();
        bus.showInfo();
        taxi.showInfo();

    }
}
