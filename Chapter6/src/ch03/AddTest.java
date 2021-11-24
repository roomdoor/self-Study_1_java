package ch03;

public class AddTest {
    public static void main(String[] args) {

        Add addL = (x, y) -> { return x + y;};

//      Add addL = (x ,y) -> x + y;  // 생략 가능
//      매개변수 하나이면 () 생략가능, 결과값 하나이고 return 없으면 {} 생략 가능, return 까지 같이 생략하면 {} 생략가능

        System.out.println(addL.add(1,2));
    }
}
