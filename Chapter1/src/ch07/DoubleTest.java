package ch07;

public class DoubleTest {
    public static void main(String[] args) {

        double dnum = 3.14; // 보통 실수 리터럴들 모두 8byte인 double에 저장됨
        float fnum = 3.14F; // float 4byte인데 8byte로 잡혀있는 숫자를 4byte에 넣으려하니 너무 커서 오류 생김
                            // 그래서 뒤에 F를 붙여서 4byte로 저장

        System.out.println(dnum);
        System.out.println(fnum);
    }

}
