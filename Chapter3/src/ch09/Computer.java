package ch09; // 추상 메서드, 추상 클래스 는 상속을 위해 만드는 클래스

public abstract class Computer {
    abstract void display();
    abstract void typing();

    void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
