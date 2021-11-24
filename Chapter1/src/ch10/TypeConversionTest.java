package ch10;

public class TypeConversionTest {
    public static void main(String[] args) {

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum1 = 255;
        byte bNum1 = (byte) iNum1;

        System.out.println(iNum1);
        System.out.println(bNum1);

        double dNum = 3.14;
        float fNum = (float) dNum;

        System.out.println(dNum);
        System.out.println(fNum);

        double dNum1 = 1.2;
        float fNum1 = 0.9F;

        int iNum2 = (int)dNum1 + (int)fNum1;
        int jNum1 = (int)(dNum1 + fNum1);
        System.out.println(iNum2);
        System.out.println(jNum1);
    }
}
