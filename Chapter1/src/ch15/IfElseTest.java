package ch15;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {

        System.out.println("나이를 입력하시면 나이에 맞는 입장료를 출력합니다.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge;

        if (age < 8) {
            System.out.println("미취학 아동입니다");
            charge = 2000;
        }

        else if (age < 14) {
            System.out.println("초등학생 입니다");
            charge = 3000;
        }

        else if (age < 20) {
            System.out.println("중,고등학생 입니다");
             charge = 4000;
        }

        else if (age < 66) {
            System.out.println("성인 입니다");
            charge = 10000;
        }

        else {
            System.out.println("노인 입니다.");
            charge = 0;
        }

        System.out.println("입장료는 " + charge + "원 입니다.");

    }
}

