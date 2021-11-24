package ch03; // 클레스 확장된것 부르면 상위 클레스에 생성자도 생성되는거 알려준것 Ex) 상위클레스에 생성자 안만들고 하위클레스 생성자 만들면 상위 클레스 디폴트로 super(); 명령어로 불러오게됨

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerRank;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerRank = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() call");
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
