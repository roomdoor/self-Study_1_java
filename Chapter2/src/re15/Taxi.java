package re15;

public class Taxi {
    private String companyName;
    private int money;
    private int taxiNumver;

    public void take() {

        money += 10000;
    }

    public void showTaxiInfo() {
        System.out.println(companyName + "의 수입은 " + money + "원 입니다.");
    }

}
