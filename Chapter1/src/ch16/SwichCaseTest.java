package ch16;

import java.util.Scanner;

public class SwichCaseTest {
    public static void main(String[] args) {

        System.out.println("월을 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day = 0; // ???? 이거 왜 int day; 로 하면 안되는거지???????

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;

            case 2:
                day = 28;
                break;

            case 4: case 6: case 9: case 11:
                day = 30;
                break;
        }

        System.out.println(month + "월은 " + day  + "일 입니다." );
    }
}
