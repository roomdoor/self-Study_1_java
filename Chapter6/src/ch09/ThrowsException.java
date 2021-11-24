package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);

        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {                 // default Exception(최상위 exception 사용으로 )  처리 예외 모두 처리
                                                // 주의  Exception 은 최상위이기 때문에 catch 맨 마지막에 써야 함  ( 위에쓰면 모든 exception 을 저기서 다 받아버림)
        }


        System.out.println("end");
    }
}
