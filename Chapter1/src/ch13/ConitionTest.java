package ch13;


import java.util.Scanner;

public class ConitionTest {
    public static void main(String[] args) {
        /*char ok = 'O';
        char no = 'X';
        int num = (100 < 3)? ok:no;
        System.out.println((char)num);*/


        int Max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요");
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1");
        int num = scanner.nextInt();
        System.out.println("입력2");
        int num1 = scanner.nextInt();


        Max = (num > num1) ? num : num1;

        System.out.println(Max);




    }
}
