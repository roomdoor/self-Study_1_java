package ch20;

public class MultiForWhileTest {
    public static void main(String[] args) {

        /*int mul = 1;
        int i;

        for ( i=2; i<=9; i++ ) {

            for (mul=1; mul<=9; mul++){
                System.out.println(i + "X" + mul + "=" + (i*mul));
            }
            System.out.println();
        }*/

        int num =1;
        int j = 1;

        while( j <= 9 ) {

            num =1; // while 문은 초기화하는 부분이 없어서 따로 넣어줘야함
            while( num<10 ) {

                System.out.println(j + "X" + num + "=" + j*num);
                num++;
            }
            j++;
            System.out.println();
        }

    }
}
