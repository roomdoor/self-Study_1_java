package ch01;
class OutClass{
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; // inClass 선언하였고 아웃클래스가 생성 될 때 인클래스가 생성되도록 하였다.

    public OutClass () {
        inClass = new InClass();
    }

    private class InClass{ // 인스턴스 클래스에서는 정적변수(static) 을 사용 할 수 없다.     // 인스턴스 이너 클래스는 아웃터 클래스가 생성 되고 나서 생성된다
                                                                               // 정적변수는 아웃터 클래스의 생성여부와 상관 없이 쓸 수 있어야한다.
                                                                               // 정적변수를 사용하려면 정적 내부 클래스에서 사용 할 수 있다.

        int iNum = 100;
        void inTest() {
            System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 인스턴스 변수)");
            System.out.println("InClass iNum = " + iNum + " (내부 클래스의 인스턴스 변수)");
        }
    }

    public void using() {  // inClass 의 메서드를 호출 할 수 있는 OutClass 의 메서드
        inClass.inTest();
    }

    static class InStaticClass {    // 정적 클래스

        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");  // 외부 클래스의 인스턴스 변수를 사용 할 수 없음
            System.out.println("OutClass num = " +iNum + " (내부 정적 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스테틱 변수)");
            System.out.println("InClass iNum = " + sInNum + " (내부 클래스의 인스턴스 변수)");
        }

        static void sTest(){
//            System.out.println("OutClass num = " +iNum + " (내부 정적 클래스의 인스턴스 변수)"); // 정적변수안에 정적 메서드는 클래스가 생성 되지 안아도 사용 가능하기 때문에 내부 인스턴스는 사용 불가능
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스테틱 변수)");
            System.out.println("InClass iNum = " + sInNum + " (내부 클래스의 인스턴스 변수)");

        }
    }
}

public class InnerTest { // InClass 와  OutClass 와 상관 없는 외부 Class 에서 사용하기
    public static void main(String[] args) {

        OutClass outClass = new OutClass(); // OutClass 를 생성함과 동시에 위에 선언된 생성자로부터 InClass 도 같이 생성되게 된다

        outClass.using();

        // 만약 InClass 가 private 로 생성되지 안았다면
        // outClass.InClass inner = outClass.new InClass();
        // inner.inTest();                                      이렇게 사용이 가능해 진다.

        System.out.println();

        OutClass.InStaticClass.sTest(); // 클래스 생성하지 않고도 사용 가능

        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();  // 정적 메서드가 아니기에 클래스 생성 후 사용 가능


    }
}
