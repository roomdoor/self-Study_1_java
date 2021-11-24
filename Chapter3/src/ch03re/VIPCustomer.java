package ch03re;

public class VIPCustomer extends Customer {

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


//    public VIPCustomer() {
//        super(0, "no - name"); 하지만 디폴트 생성자도 이런식으로 사용 가능함
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        customerRank = "VIP";

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName); // 이부분이 따로 만들어 준 부분
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerRank = "VIP";

        System.out.println("VIPCustomer(int, string) call ");
    }

}
