package ch15.re;

public class Student {

    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.takeTaxi(5000);
        this.money -= 5000;
    }

    public void takeBUs(Bus bus) {
        bus.takeBus(1000);
        this.money -= 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showInfo() {
        System.out.println(name + "학생의 잔액은 " + money + "원 입니다.");
    }
}
