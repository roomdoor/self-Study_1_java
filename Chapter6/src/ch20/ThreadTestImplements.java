package ch20;

class MyThread2 implements Runnable{        // 이미 extends 한 class 의 경우

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTestImplements {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + " start");
        MyThread2 runnable = new MyThread2();

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + " end");

        Runnable run = new Runnable() {         // Thread 화 될 수 있는 인터페이스 // 익명이너클레스에 나온거
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }

}
