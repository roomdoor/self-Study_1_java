package re24;

import java.util.ArrayList;

public class Student {
    private static int serialNumber = 1000;

    private String name;
    private int studentNumber;
    ArrayList<Subject> subjectList;

    public Student (String name) {
        this.name = name;
        this.studentNumber = serialNumber++;

        subjectList = new ArrayList<>();
    }
    public void addSubject(String name, int score){
        Subject subject = new Subject();

        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showInfo() {
        int total = 0;
        int average = 0;
        System.out.println(studentNumber + "학번 " + name + " 학생의 성적 입니다." );

        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            System.out.println(subject.getSubjectName() + "과목의 점수는 "+ subject.getScore() + "점 입니다.");

        }

        System.out.println(studentNumber + "학번 " + name + " 학생의 성적 입니다.");
        for (Subject subject : subjectList) {



            System.out.println(subject.getSubjectName() + "과목 " + subject.getScore() + "점 임");
        }

    }


}
