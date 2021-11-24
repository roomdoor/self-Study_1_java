package ch01;

class Outer2 {

    int outNum = 100; // 맴버 변수는 여기서 초기화하는것 보다 생성자에서 하는것이 좋은 코딩법
    static int sNum = 200;

    Runnable getRunnable(final int i) {   // 메서드 가 있다. Runnable 이라는 인터페이스를 반환 한다.  Java.lang 패키지 안에 클래스를 쓰레드화 할때 사용 함

        final int num = 10;


        class MyRunnable implements Runnable {  // 로컬 이너 클래스

            int localNum = 1000;

            @Override
            public void run() {

//                i = 100;  // 지역 변수와 매개변수는 스택메모리에 잡히게 되므로 메서드가 끝나게되면 없어지게된다
//                num = 50; // 하지만 run 이라는 메서드는 다시 호출 될수 있지만 그때 i 와 num 이 존재하지 안을 수 있다. 따라서 지역변수와 매개변수는 final(상수 매모리에 잡힘) 로 선언해야 한다 ( 지금 컴파일러가 해줌)

                System.out.println("i = " + i);             // 매개변수는 매서드가 호출 될때 스택메모리에 생성됨
                System.out.println("num = " + num);         // 지역변수  매서드 안에 선언된 변수 마찬가지로 스택메모리
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }


    // MyRunnable 이라는 클래스가 사용 되는 경우는 run 매서드를 사용하는 때 말고는 없으므로 class 를 없애서 사용하면 그 방법이 AnonymousClass 이다.
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();   // Runnable 메서드가 호출되고 return 값인 MyRunnable 이 반환되고 메서드가 끝이난다.
                        // 그러면 Runnable 메서드 안의 매개변수 i 와 지역변수  localNum 은 스택메모리에서 사라지게 되므로
                        // MyRunnable Class 의 run 메서드에서 사용될 수 없게된다.
                        // 따라서 Runnable 의 지역변수와 매개변수는 final 상수 변수로 선언되어야 한다. (컴파일러가 알아서 해줌) 상수 변수이므로 값을 변경 할 수는 없다.
    }
}
