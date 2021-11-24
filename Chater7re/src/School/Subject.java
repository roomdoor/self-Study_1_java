package School;

import utill.Define;

import java.util.ArrayList;

public class Subject {

    private int subjectId;
    private String SubjectName;
    private int gradeType;


    public Subject(String name, int Id) {
        this.subjectId = Id;
        this.SubjectName = name;
        this.gradeType = Define.AB_TYPE;
    }

    private ArrayList<Student> studentList = new ArrayList<>();

    public void register(Student student) {
        studentList.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
