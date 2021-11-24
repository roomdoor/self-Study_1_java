package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("writer")) {

            fw.write('A');
            char[] buf = {'B','C','D','E','F','G'};

            fw.write(buf);
            fw.write("써져나요??");
            fw.write(buf,2,3);  // offset 부터 len 개 출력
            fw.write("65");

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
