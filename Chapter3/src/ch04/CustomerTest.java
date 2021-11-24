package ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이시화");
        customerLee.bonusPoint = 10000;
        int price = customerLee.calcPrice(1000);    // @@@@@@@ 1 Customer 에 정의된 인스턴스는 Customer 에 calcPrice 매서드 적용
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerLe = new VIPCustomer(10020, "이이시화");
        customerLe.bonusPoint = 100000;
        price = customerLe.calcPrice(1000);         // @@@@@@@2 VIPCustomer 에 정의 된 인스턴스는 오버라이딩 된 VIPCustomer 의 매서드 적용
        System.out.println(customerLe.showCustomerInfo() + price);


        Customer vc = new VIPCustomer(123, "묵시적 형변환 Test");
        vc.calcPrice(1000);                         // @@@@@@@3 인스턴스는 VIPCustomer 이지만 변수 타입은 Customer
        System.out.println(vc.calcPrice(1000));     // @@@@@@@3 이 경우 가상 매서드라고 불리고 인스턴스 쪽 매서드가 불러진다.
        //vc.?????? // 인스턴스는 VIPCustomer 로 생성되겠지만 타입은 Customer 이다. 그래서 . 뒤에 Customer 것만 쓸 수 있다 Ex) agentId 나 salesRatio 는 사용 못함
        // 변수는 자기 자신꺼만 사용 만약 사용하려면 다운캐스팅(다음에 배우는거) 해아함

    }
}
