package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {


        Student s1 = new Student(100, "Lee");
        Student s2 = new Student(100, "Lee");
        Student s3 = s1;
        System.out.println(s1 == s2);        // 주소값이 다르기 때문에 false 나옴
        // 주소값이 다르기 때문에 false 나옴 but equals 재정의 했기때문에 true
        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s3);


        System.out.println(s1.hashCode()); // 해쉬 메서드를 학번이 반환되게 오버로딩함
        System.out.println(s2.hashCode());

        System.out.println(System.identityHashCode(s1)); // 실제 해쉬코드 주소는 두개가 다름
        System.out.println(System.identityHashCode(s2)); // 실제 해쉬코드 주소는 두개가 다름

//        String st1 = new String("abc");
//        String st2 = new String("abc");
//
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.hashCode()); // 같은 주소값이 나옴
//        System.out.println(st2.hashCode());
//
//        Integer i = 100; // Integer 의 경우 해쉬값이 그 정수로 나옴
//        System.out.println(i.hashCode());

        s1.setStudentName("kim");
        Student copyStudent = (Student) s1.clone();
        System.out.println(copyStudent); //

        s1.setStudentName("Lee");
    }
}
