package ch02;

public class VIPCustomer extends Customer{

//    private int customerId;            // 위에 상속관계 선언으로 이 부분을 선언 할 필요가 없어짐
//    private String customerName;
//    private String customerRank;
//    int bonusPoint;
//    double bonusRatio;

    double saleRatio;
    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public VIPCustomer() {
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerRank = "VIP";

    }

}
