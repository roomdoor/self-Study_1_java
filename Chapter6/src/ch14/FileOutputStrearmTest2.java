package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStrearmTest2 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output2.txt");
        try (fos) {

            byte[] aToz = new byte[26];
            for (int i = 0; i < 26; i++) {
                aToz[i] = (byte) (i + 65);
            }

            fos.write(aToz);

        } catch (IOException e) {
            e.printStackTrace();
        }


        FileOutputStream fos2 = new FileOutputStream("output3.txt");
        try (fos2) {

            byte[] aToz = new byte[26];
            for (int i = 0; i < 26; i++) {
                aToz[i] = (byte) (i + 65);
            }

            fos2.write(aToz, 2 , 12);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
