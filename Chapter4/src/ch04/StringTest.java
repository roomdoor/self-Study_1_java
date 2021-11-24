package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();
        for (Constructor co : cons) {
            System.out.println(co); // java.lang 의 생성자 볼 수 있음
        }

        Method[] m = c.getMethods();
        for(Method mth : m) {
            System.out.println(mth); // java.lang 의 메서드 볼 수 있음
        }
    }
}
