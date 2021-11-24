package ch03;

public class FuntionTest {

        public static int addNum( int num1, int num2 ) {
            int result;
            result = num1 +num2;
            return result;
        }

        public static void sayHello(String greeting) {
            System.out.println(greeting);
        }

        public static int calcsum() {
            int sum = 0;

            for (int i = 1; i <=100; i++) {
                sum +=i;
            }
            return sum;
        }

    public static void main(String[] args) {

            int n1 = 10;
            int n2 = 20;

            int total = addNum(n1, n2);
        System.out.println(total);
        sayHello("우와아아 된다");

        total = calcsum();
        System.out.println(total);

    }
    }
