package ch21;

public class JoinTest extends Thread {

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {

        for (int i = start; i <= end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {


        System.out.println(currentThread() + " start");

        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try {
            jt1.join();                         // Thread join 메서드  join 을 건 Thread 는 join 이 걸린 Thread 가 끝이 나야 시작을 한다
            jt2.join();
        } catch (InterruptedException e) {      // join 을 걸면 interrupt Exception 발생할 수 있기 때문에
            e.printStackTrace();
        }

        int laseTotal = jt1.total + jt2.total;

        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);

        System.out.println("last total = " + laseTotal);
        System.out.println(currentThread() + " end");

    }
}
