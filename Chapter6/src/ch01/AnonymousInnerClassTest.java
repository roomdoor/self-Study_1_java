package ch01;

class Outer3 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i) {   // MyRunnable 이라는 클래스가 사용 되는 경우는 run 매서드를 사용하는 때 말고는 없으므로 class 를 없애서 사용하면 그 방법이 AnonymousClass 이다.

        final int num = 10;

        return new Runnable() {

            int localNum = 1000;

            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수");
                System.out.println("Outer2.sNum = " + ch01.Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        }; // implementation 의 끝을 알려주기 위해 ; 사용
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable Class");
        }
    };
}

public class AnonymousInnerClassTest {


    public static void main(String[] args) {

        Outer3 out = new Outer3();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();



    }
}


