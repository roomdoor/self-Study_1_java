package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("reader.txt")){  // 문자로 된 file 은 FileInputStream 대신 File Reader 사용

            int i;

            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("end");
    }
}
