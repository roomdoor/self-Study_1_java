package ch09;

public class Ch09Test {
    public static void main(String[] args) {

        Student studentLee = new Student("이시화" , "sihwa95");
        Student studentKim = new Student("김시화", "kimsi95");

        studentLee.setKoreaSubject("국어", 90);
        studentLee.setmathSubject("수학", 100);

        studentKim.setmathSubject("수학", 90);
        studentKim.setKoreaSubject("국어", 80);

        studentLee.scoreInfor();
        studentKim.scoreInfor();
    }
}
