package ch02;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerId(10010);
        customerLee.setCustomerName("이시화");
        customerLee.bonusPoint = 10000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerLe = new VIPCustomer();
        customerLe.setCustomerName("이이시화");
        customerLe.setCustomerId(101010);
        customerLe.bonusPoint = 100000;
        System.out.println(customerLe.showCustomerInfo());
    }
}
