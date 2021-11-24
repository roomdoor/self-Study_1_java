package ch13;

public class BitOperationTest {
    public static void main(String[] args) {

        int num = 5;   // 00000101;
        int num1 = 10; // 00001010;

        System.out.println(num & num1); // 00000000; and
        System.out.println(num | num1); // 00001111; or
        System.out.println(num ^ num1); // 00001111; xor
        System.out.println(num1 <<1);   // 00010100; 왼쪽으로 시프트 1
        System.out.println(num1 <<2);   // 00101000; 왼쪽으로 시프트 2
        System.out.println(num1 >>1);   // 00000101; 오른쪽으로 시프트 1
        System.out.println(num1 >>>1);  // 00000101; 앞에 부호 상관없이 오른쪽으로 시프트 1
        System.out.println(~num);       // 11110101; 0은 1롤 1은 0으로
        System.out.println(num);
        System.out.println(num1);       // 위에 연산은 저장 안됨
        System.out.println(num <<= 3);    // 연산 결과 변수에 저장하려면 <<=
        System.out.println(num);
    }
}
