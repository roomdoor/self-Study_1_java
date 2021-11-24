package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int studentGrade;

    public Student(){}
    public Student(int studentNumber, int studentGrade, String studentName) {
        // studentNumber = studentNumber 이렇게 하면 가장 가까운 studentNumber 와 연계되기 때문에 XX 그래서 this 사용
        this.studentNumber = studentNumber;
        this.studentGrade = studentGrade;
        this.studentName = studentName;
        System.out.println("학생이 생성 되었습니다."); // 생성자를 직접 만들었고 생성자 생성시 매서드 작용하게 만듬
    } // 생성자 직접 만들게 되면 default 생성자 없어짐 default 생성자 쓰고 싶으면 public Student(){} 로 만들어 주면 가능

    public String showStudentInfor() {
        return studentName + "학생의 학번은 " + studentNumber + "이고 학년은 " + studentGrade + "입니다.";
    }

}
