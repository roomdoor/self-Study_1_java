package ch09; // 상속된 클레스에 추상 메서드 정의하기

public class Desktop extends Computer {


    @Override
    void display() {
        System.out.println("Desktop display");
    }

    @Override
    void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    void turnOn() {
        System.out.println("Desktop turn on");
    }

    @Override
    void turnOff() {
        System.out.println("Desktop turn off");
    }
}
