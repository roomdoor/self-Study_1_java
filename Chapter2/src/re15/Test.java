package re15;

public class Test {
    public static void main(String[] args) {

        Student Lee = new Student("이시화", 20000);
        Taxi taxi = new Taxi();

        Lee.take(taxi);

        Lee.showInfo();
        taxi.showTaxiInfo();
    }
}
