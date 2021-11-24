package ch03;

public class StringTest {
    public static void main(String[] args) {

        String java = new String("java");       // String 은 final 로 선언되어 바뀌지 않는다
        String android = new String("android");

        System.out.println(System.identityHashCode(java)); // 연결전 주소화 연결 후 주소가 다르게 된다
        java = java.concat(android);
        System.out.println(System.identityHashCode(java)); // 연결전 주소화 연결 후 주소가 다르게 된다  이렇게 String 을 계속 연결해서 사용하면 메모리 낭비가 심해진다.



    }
}
