package ch08; // 다운 캐스팅

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

        if (customerA instanceof GoldCustomer) { // instanceof 는 앞의 변수가 이 타입의 인스턴스인지 확인해주는 명령어
            GoldCustomer vc = (GoldCustomer) customerA; // GoldCustomer 타입의 인스턴스를 VIPCsutomer 타입으로 입력 불가능
            System.out.println(customerA.showCustomerInfo());
        }
    }
}
