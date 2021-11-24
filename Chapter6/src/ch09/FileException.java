package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {


//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("a.txt");
//            System.out.println("read");
//            try {                                 // 매번 열린 파일을 닫아주기 위해 fis.close(); 를 사용하고 거기에 try catch 가 다시 걸림 너무 지저분해서 finally 사용
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            return;                                         // return 이 있으면 end 출력이 안되지만 finally 는 계속 출력 됨
//            try {                                 // 매번 열린 파일을 닫아주기 위해 fis.close(); 를 사용하고 거기에 try catch 가 다시 걸림 너무 지저분해서 finally 사용
//                fis.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
//        System.out.println("end");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// finally  사용
////        FileInputStream fis = null;
////        try {
////            fis = new FileInputStream("a.txt");
////            System.out.println("read");
////        } catch (FileNotFoundException e) {
////            System.out.println(e);
////            return;                                         // return 이 있으면 end 출력이 안되지만 finally 는 계속 출력 됨
//        }
//        finally {                                     //catch 가 하나가 아닐 경우 열린 파일 닫아 줄때마다 try catch 가 생겨서 코드가 지저분해짐 try 가 호출되면 finally 는 무조껀 수행됨
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("finally");
//        }
//        System.out.println("end");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//try - with - resources 문 사용

        try (FileInputStream fis = new FileInputStream("a.txt")) {

            System.out.println("read");
        } catch (FileNotFoundException e) {  // 파일이 없을떄 나는 exception
            e.printStackTrace();
        } catch (IOException e) {           // close 하는 excdption
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
