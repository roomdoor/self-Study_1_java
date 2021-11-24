package ch19;

public class ForTest {
    public static void main(String[] args) {


        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }

        System.out.println(num);
        System.out.println(sum);

        int num1 = 1;
        int sum1 = 0;

        for(int i =0; i < 10; i++, num1++) {
            sum1 += num1;
        }
        System.out.println(num1);
        System.out.println(sum1);
    }
}
