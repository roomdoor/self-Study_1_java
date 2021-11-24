package ch08;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer(int customerId, String customerName) {
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

