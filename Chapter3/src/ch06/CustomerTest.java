package ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customersList = new ArrayList<>();

        Customer customerT = new Customer(10010, "t");
        Customer customerJ = new Customer(10020, "j");
        Customer customerA = new GoldCustomer(10030, "a");
        Customer customerB = new GoldCustomer(10040, "b");
        Customer customerC = new VIPCustomer(10050, "c");

        customersList.add(customerT);
        customersList.add(customerJ);
        customersList.add(customerA);
        customersList.add(customerB);
        customersList.add(customerC);

        for (Customer customer : customersList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customersList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 보너스 포인트는 " + customer.bonusPoint + " 점 입니다. ");
        }
    }
}
