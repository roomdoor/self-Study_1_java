package ch21;

public class PropertyTest extends Thread {

    public void run() {
        int sum = 0;

        Thread t = currentThread();
        System.out.println(t + " start");

        for (int i = 0; i < 100000; i++) {
            sum += i;
        }

        System.out.println(t.getPriority() + " end");
    }

    public static void main(String[] args) {


        System.out.println(currentThread() + " start");

        PropertyTest pt = new PropertyTest();
        PropertyTest pt1 = new PropertyTest();
        PropertyTest pt2 = new PropertyTest();

        pt.setPriority(Thread.MAX_PRIORITY);
        pt1.setPriority(Thread.NORM_PRIORITY);
        pt2.setPriority(Thread.MIN_PRIORITY);
        pt.start();
        pt1.start();
        pt2.start();

        System.out.println(currentThread() + " end");
    }
}
