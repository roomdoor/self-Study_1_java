package ch21;

public class ContinueTest {
    public static void main(String[] args) {

        int num;

        for ( num =1; num <100; num++ ) {

            if( ( num%3 ) == 0 ) {  // == 같다 기호 쓴거
                System.out.println(num);
            }
        }
        System.out.println();

        for ( num =1; num <100; num++ ) { // != 와 continue 써서 한거

            if( ( num%3 ) != 0 ) continue; {
                System.out.println(num);
            }
        }
    }
}
