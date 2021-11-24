package ch21;

import java.io.IOException;

public class TerminateThreadTest extends Thread {


    private boolean flag = false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public TerminateThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (!flag) {

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " end");
    }

    public static void main(String[] args) throws IOException {

        TerminateThreadTest A = new TerminateThreadTest("A");
        TerminateThreadTest B = new TerminateThreadTest("B");
        TerminateThreadTest C = new TerminateThreadTest("C");

        A.start();
        B.start();
        C.start();

        int in;

        while (true) {
            in = System.in.read();

            if (in == 'A') {
                A.setFlag(true);
            } else if (in == 'B') {
                B.setFlag(true);
            } else if (in == 'C') {
                C.setFlag(true);
            } else if (in == 'M') {
                A.setFlag(true);
                B.setFlag(true);
                C.setFlag(true);
                break;
            } else {
                System.out.println("그거 말고 딴거 입력해봐 ");
            }
        }
        System.out.println("main end");
    }
}

