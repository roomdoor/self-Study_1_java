package ch18;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println("pos : " + rf.getFilePointer()); // int  4byte 라서 위치 4
        rf.writeDouble(3.14);
        System.out.println("pos : " + rf.getFilePointer()); // double 8byte 라서 위치 4 + 8 = 12
        rf.writeUTF("안녕하세요");
        System.out.println("pos : " + rf.getFilePointer()); // 한글 한글자당 3byte + 끝날때 null 값 2byte

        rf.seek(0);     // file pointer 위치 설정

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
