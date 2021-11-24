package ch06;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(int customerId, String customerName) { // 디폴트 생성자 없어서 생성자 따로 생성해줘야함
        super(customerId, customerName);
        customerRank = "GOLD";
        saleRatio = 0.1;
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint +=  price * bonusRatio;
        return price - (int)(price * saleRatio);

    }
}

