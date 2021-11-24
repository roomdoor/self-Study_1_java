package ch09;   // AutoClosable 사용

public class AutoCloseTest {
    public static void main(String[] args) {

        AutoCloseable obj = new AutoClosableObj();

        try(obj){                                                   // try 에 아무것도 넣지 안아 catch 로 가지 안음 // try 가 잘 끝나게되면 obj 에 선언한 Close... 이 출력 되고 AutoClose 가 잘 수행 된것
              throw new Exception(); // 강제 exception 발생          // exception 이 발생해도 close 가 잘 됨
        }catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("end");              //
    }

}
