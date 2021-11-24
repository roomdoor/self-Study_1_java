package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        int i;

        try (FileInputStream fis = new FileInputStream("a1.txt")) {

            byte[] bs = new byte[10];               // 바이트 배열로 10개씩 끊어 읽기

            while (((i = fis.read(bs))) != -1) {   // 지금 i 값은 바이트 수가 된다 ( 몇바이트를 읽었는지)


                for (int j = 0; j < i; j++) {           // ABCDEFGHIJ:10바이트 읽음
//                                                         KLMNOPQRST:10바이트 읽음
//                                                          UVWXYZQRST:6바이트 읽음 == 여기 Z 뒤에 QRST 가 나오는 이유는 이 전에 읽은 것이 버퍼에 남아있기 때문
//                                                                                               이 것을 없애기 위해 enhanced for 문이 아닌 일반 for 문으로 j < ㅑ 까지만 출력하게 하면 됨

                    System.out.print((char) bs[j]);
                }
                System.out.println(":" + i + "바이트 읽음 ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
