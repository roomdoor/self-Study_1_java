package ch15.re;

public class Taxi {

    private String name;
    private int money;


    private static Taxi instance = new Taxi();

    private Taxi() {
    }

    public static Taxi getInstance() {
        if (instance == null) instance = new Taxi();
        return instance;
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

    public void takeTaxi(int money) {
        this.money += 5000;
    }

    public void showInfo() {
        System.out.println(name + " 회사의 총 수입은 " + money + "원 입니다.");
    }

}
