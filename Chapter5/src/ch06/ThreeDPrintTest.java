package ch06;

public class ThreeDPrintTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial(); //오브젝트 타입으로 정의 되어서 형변환이 필요함
    }
}
