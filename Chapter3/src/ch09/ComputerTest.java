package ch09; // 추상 클레스(추상 메서드를 포함한 클래스)는 new 할 수 없다(인스턴스화 할 수 없음)

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        Computer desktop1 = new Desktop(); // 상속되어 있기 떄문에 Computer 로도 가능
        MyNoteBook noteBook = new MyNoteBook();
//        Computer computer = new Computer() {  //추상 메서드를 포함한 추상클래스라 new 불가능
//        }
        desktop.display();
        desktop.turnOn();

    }
}
