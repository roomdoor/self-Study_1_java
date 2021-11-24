package ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        System.out.println(studentLee.showStudentInfor()); // 인스턴스 생성시 생성자가 인스턴스 매개변수를 모두 초기화하여 null 과 0이됨


        Student studentKim = new Student(431, 3, "Kim");
        System.out.println(studentKim.showStudentInfor());

    }
}
