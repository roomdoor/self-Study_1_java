package ch04;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = (x, y) -> x > y ? x : y;
//            if (x > y) return x;          // 간단하게 쓰는게 좋으므로 조건 연산자 사용
//            else return y;
        System.out.println(myNumber.getMax(10,21));
    }
}
