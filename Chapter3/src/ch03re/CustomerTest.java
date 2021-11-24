package ch03re;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010,"이시화");
        customerLee.bonusPoint = 10000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerLe = new VIPCustomer(10020,"이이시화");
        customerLe.bonusPoint = 100000;
        System.out.println(customerLe.showCustomerInfo());


        Customer vc = new VIPCustomer(123, "묵시적 형변환 Test");
        //vc.?????? // 인스턴스는 VIPCustomer 로 생성되겠지만 타입은 Customer 이다. 그래서 . 뒤에 Customer 것만 쓸 수 있다 Ex) agentId 나 salesRatio 는 사용 못함
                    // 변수는 자기 자신꺼만 사용 만약 사용하려면 다운캐스팅(다음에 배우는거) 해아함

    }
}
