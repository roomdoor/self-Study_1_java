package ch15;

public class TestCh15 {
    public static void main(String[] args) {

        Person person1 = new Person("Edward", 20000);
        Taxi taxi1 = new Taxi("잘나간다 운수");

        person1.takeTaxi(taxi1);
        person1.takeTaxi(taxi1);


        person1.showInfor();
        taxi1.showInfor();
    }
}
