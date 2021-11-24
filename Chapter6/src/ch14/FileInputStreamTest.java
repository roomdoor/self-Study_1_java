package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");  // FileNotFoundException  catch 에 표시
            System.out.println((char)fis.read());    // read() 에서 IOException 발생함  @@@@
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        } catch (IOException e) {                       // FileNotFoundException 보다 IOException 이 상위 라서 대체 가능
            e.printStackTrace();

//            try {             // finally 있어서 정리해도 됨
//                fis.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            } catch (Exception e2){ // NullPointException  null 일때 close 하면 발생하는 Exception
//                System.out.println(e2);
//
//            }
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2){ // NullPointException
                System.out.println(e2);
            }
        }
        System.out.println("end");
    }
}
