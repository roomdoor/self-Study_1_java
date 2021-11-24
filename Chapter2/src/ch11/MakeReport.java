package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line  = "========================================\n";
    private String title = "이름 \t 주소 \t\t 전화번호 \n";

    private void makeheader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generatebody() {
        buffer.append("Lee \t");
        buffer.append("서울 마포구\t");
        buffer.append("010-1234-1234\n");

        buffer.append("Kim \t");
        buffer.append("서울 양천구\t");
        buffer.append("010-1423-1432\n");
    }

    private void makefooter() {
        buffer.append(line);
    }

    public String getreport() {
        makeheader();
        generatebody();
        makefooter();
        return buffer.toString();
    }

}
