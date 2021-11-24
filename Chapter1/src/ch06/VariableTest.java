package ch06;

public class VariableTest {
    public static void main(String[] args) {

        //byte bnum = 128; // 4byte 정수는 -128 ~ 127 까지 표현 가능해서  128 넣으면 오류남


        //int num = 12345678900; // 8 byte 넘어서 안들어감

        long lNum = 12345678900L; // 8byte 넘는 숫자 long 변수에 숫자 마지막에 L 붙여서 저장;
        System.out.println(lNum);

    }
}
