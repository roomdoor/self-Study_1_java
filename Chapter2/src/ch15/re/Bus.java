package ch15.re;

public class Bus {

    private String name;
    private int money;

    private Bus() {
    }

    private static Bus instance = new Bus();

    public static Bus getInstance() {
        if (instance == null) instance = new Bus();
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

    public void takeBus(int money) {
        this.money += 1000;
    }

    public void showInfo() {
        System.out.println(name + " 회사의 총 수입은 " + money + "원 입니다.");
    }

}
