package ch09;

public class Student {

    String StudentName;
    String StudentId;


    Subject korea;
    Subject math;

    public Student(String studentName, String studentId) {
        this.StudentName = studentName;
        this.StudentId = studentId;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.SubjectName = name;
        korea.SubjectScore = score;
    }

    public void setmathSubject(String name, int score){
        math.SubjectName = name;
        math.SubjectScore = score;
    }

    public void scoreInfor(){
        int total = korea.SubjectScore + math.SubjectScore;
        System.out.println(StudentName + "의 총점은 " + total + "점 입니다.");
    }

}
