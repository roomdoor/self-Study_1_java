package School;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<>();

    public Student(int Id, String name, Subject majorSubject){
        this.studentId = Id;
        this.studentName = name;
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentID) {
        this.studentId = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }
}
