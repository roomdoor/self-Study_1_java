package ch25;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String name;

    ArrayList<Subject> subjectList = new ArrayList<>();

    public Student(int Id, String name){
        this.studentId = Id;
        this.name = name;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total =0;

        for (Subject subject : subjectList){
            total += subject.getScore();
            System.out.println("학생 " + name + "의 " + subject.getName() + "과목의 점수는 " + subject.getScore() + "점 입니다.");
        }
        System.out.println("학생 " + name + "의 총점은 " + total + "점 입니다.");


    }

}
