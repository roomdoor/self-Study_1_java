package ch04; // 디폴트 생성자 말고 일반 생성자 만들면 super();값을 컴파일러가 자동으로 생성 안해줘서 따로 만들어 줘야함

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerRank;
    int bonusPoint;
    double bonusRatio;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        customerRank = "SILVER";
        bonusRatio = 0.01;

    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerRank() {
        return customerRank;
    }

    public void setCustomerRank(String customerRank) {
        this.customerRank = customerRank;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerRank + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
