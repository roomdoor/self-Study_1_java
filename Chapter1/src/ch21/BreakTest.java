package ch21;

public class BreakTest {
    public static void main(String[] args) {

        int sum = 0;
        int num;

        for(num =1; sum <100; num++) {
            sum +=num;
        }

        System.out.println(num); // sum 이 100을 넘은순간 num은 14이지만 증감이 된 후 조건문을 체크하기 때문에 15가 나온다
        System.out.println(sum); //

        sum =0;
        for(num =1; ; num++) {
            sum +=num;
            if (sum>=100){
                break;}
        }
        System.out.println(num); // 조건문 for문에 안쓰고 안에 if 로 조건 달아서 증가되기 전에 break
        System.out.println(sum);
    }
}

