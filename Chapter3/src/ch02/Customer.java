package ch02; // 클레스 확장 처음에 하는 방법 알려준것

public class Customer {
    protected int customerId;   // protected 외부 클레스에서는 보호되지만 상속 클레스, 같은 패키지에는 사용가능
    protected String customerName;
    protected String customerRank;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
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
