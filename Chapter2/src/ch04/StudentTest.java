package ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentID = 1234;
        studentLee.setStudentName("Lee");
        studentLee.studentAddress = "서울 양천구 목동";

        studentLee.showStudentInfor();

        Student studentKim = new Student();

        studentKim.studentID = 4321;
        studentKim.setStudentName("Kim");
        studentKim.studentAddress = "서울 마포구 상수동";

        studentKim.showStudentInfor();

        System.out.println(studentKim);
        System.out.println(studentLee);


    }
}
