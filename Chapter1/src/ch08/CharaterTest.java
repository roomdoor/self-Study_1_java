package ch08;

public class CharaterTest {
    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        // char 라는 자료형은 2btye로 사용되고 (유니코드로) 사용되고 내부적으로 대응되는 정수값이 존재한다 EX) 65=A 66=B 67=C

    }
}
