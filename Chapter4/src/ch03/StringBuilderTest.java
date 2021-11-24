package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer)); // 연결해도 주소가 바뀌지 않게됨
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer)); // 가변가능 하기 때문이다.

        String Test = buffer.toString(); // 형변환
        System.out.println(Test);

    }
}
