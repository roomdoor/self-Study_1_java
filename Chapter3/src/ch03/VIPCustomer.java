package ch03;

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

    public VIPCustomer() {
        super(); // 하위 클래스가 상위 클래스의 참조값을 가지는 것 this 와 비슷함, 이거 안써도 자동으로 컴파일러가 default construct 넣어줌
                 // 이거 쓰면 Customer 의 constructor 호출됨
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerRank = "VIP";

        System.out.println("VIPCustomer() call ");
    }

}
