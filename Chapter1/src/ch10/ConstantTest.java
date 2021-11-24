package ch10;

public class ConstantTest {
    public static void main(String[] args) {

        final int MAX_NUM = 100;  //final 예약어로 선언하면 상수로 되어 저 변수는 바뀌지 않음
        final int MIN_NUM;          // 상수는 대문자로 표현함 , 초기화필요

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);


    }
}
