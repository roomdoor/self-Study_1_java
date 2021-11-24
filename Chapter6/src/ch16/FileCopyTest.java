package ch16;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {

        long millisecond = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"))) {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));

            millisecond = System.currentTimeMillis(); // 현재 시간 읽는거

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond; //

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(millisecond + " 소요되었습니다."); // 21920 ms 걸림 buffer 안썼을때
                                                            // 47 ms 걸림 buffer 썼을때
    }
}
