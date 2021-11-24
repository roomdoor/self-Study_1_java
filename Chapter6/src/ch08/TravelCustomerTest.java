package ch08;

import java.util.ArrayList;
import java.util.Arrays;

public class TravelCustomerTest {
    public static void main(String[] args) {

        TravelCustomer customerKim = new TravelCustomer("Kim",20,100);
        TravelCustomer customerLee = new TravelCustomer("Lee",30,100);
        TravelCustomer customerNa = new TravelCustomer("Na",40,100);
        TravelCustomer customerPark = new TravelCustomer("Park",13,50);

        ArrayList<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerNa);
        customerList.add(customerPark);

        System.out.println("고객 명단 출력");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println("여행 비용");
        customerList.stream().map(c-> c.getCost()).forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("20세 이상 고객");
        customerList.stream().filter(c -> c.getAge() >=20).map(c-> c.getName()).sorted().forEach(s -> System.out.println(s));

        }
}
