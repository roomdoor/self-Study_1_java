package ch18;

public class CompanyTest {
    public static void main(String[] args) {


        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1); // jvm 이 할당해준 heep 메모리 주소가 찍힘 같은 주소가 나오게 됨
        System.out.println(company2);


    }
}
