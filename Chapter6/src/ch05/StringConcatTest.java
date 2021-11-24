package ch05;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "람다식";
        String s2 = "클래스";

        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("람다식", "클래스");

        StringConcat concat = (s, ss) -> System.out.println(s1 + ", " + s2);

        concat.makeString(s1,s2);

        StringConcat concat1 = new StringConcat() {  // 람다식을 쓰더라도 익명 클래스(anonymous class) 가 생성된다 아래와 같이
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s2 + ", " + s1);
            }
        };
        concat1.makeString(s1, s2);
    }
}
