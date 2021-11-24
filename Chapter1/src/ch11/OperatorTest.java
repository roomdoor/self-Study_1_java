package ch11;

public class OperatorTest {
    public static void main(String[] args) {

        int gameScore = 150;

        int lastScore = ++gameScore;  // ++gameScore 는 gamScore += gamScore 또는 gameScore = gameSocre =1 과 같다
        System.out.println(gameScore); // ++ 이 앞에 있으면 그 스테이트가 끝나기 전에 1이 더해지고
        System.out.println(lastScore);

        int gamScore1 = 150;
        int lastSocre1 = gamScore1++; // ++이 뒤에 있으면 그 스테이트가 끝나고 나서 1이 더해진다
        System.out.println(gamScore1);
        System.out.println(lastSocre1);
    }

}
