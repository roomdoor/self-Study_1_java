package ch12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 +10 )< 10 && (i = i+2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 4가 출력될것 같지만 단락회로평가(short circuit evaluation)로 i+2 진행되지 안음

        boolean value1 = ((num1 = num1 +10 )< 10 || (i = i+2) < 10);
        System.out.println(value1);
        System.out.println(num1);
        System.out.println(i);
    }
}
