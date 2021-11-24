package ch14;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {


        int SchoolAge;

        System.out.println("나이를 입력하십시오.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>=8) {
            System.out.println("학교에 다닙니다.");
        }
        else{
            System.out.println("학교에 다니지 않습니다.");
        }

        SchoolAge = (age >=8) ? 'O':'X';

        System.out.println((char)SchoolAge);


    }
}
