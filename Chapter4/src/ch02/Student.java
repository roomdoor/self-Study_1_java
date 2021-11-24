package ch02;

public class Student implements Cloneable{
    private int studentNumber;
    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int studentNumber, String studentName) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public String toString() {
        return studentNumber + "," + studentName;
    }

    @Override
    public int hashCode() {

        return studentNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj; // 다운케스팅
            if (this.studentNumber == std.studentNumber) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}