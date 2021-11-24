package ch20;

class MyThread extends Thread {

    public void run(){  // Thread 가 시작이 되면 불려지는 메서드여서 구현해야함
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }

}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + " start");
        MyThread th1 = new MyThread();              // 총 3개의 thread 가 돌아가는것 main, th1, th2   main 도 thread 하나를 포함하고 있음
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + " end");
    }

}
