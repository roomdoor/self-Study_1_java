package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {
    public static void main(String[] args) {

        System.out.println("알파벳을 여러 개 쓰고 [Enter]를 누르세요.");
        int i;
        try {
            InputStreamReader isr = new InputStreamReader(System.in); // 한바이트씩 읽는 in 을 바이트 단위로 묶어서 읽게 해주는 보조 스트림
            while ((i = /*System.in.read() (inputStreamReader 안쓰면 쓰는거)*/isr.read()) != '\n') {  //in 은 inputStream 으로 되어 있어서  한바이트씩 읽기 때문에 한글 쓰면다 꺠져서 나옴
//                System.out.println(i);
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
