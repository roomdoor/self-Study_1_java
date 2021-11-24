package ch04;

public class Student {

    public int studentID;
    public String studentAddress;
    public String studentName;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }


    public void showStudentInfor() {
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고 주소는 " + studentAddress + "입니다.");


    }
}
