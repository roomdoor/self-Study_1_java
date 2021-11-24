package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStrearmTest {

    public static void main(String[] args) {

        try (FileOutputStream  fos = new FileOutputStream("output.txt")){  // 다시 쓰면 안에 데이터 다 지워지고 써짐      쓰려면 "output.txt" 뒤에 true ( 기본값 false)

            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);



        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
