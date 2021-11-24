package ch09; // 하나라도 정의되지 안은 추상 메서드가 있으면 클레스 앞에 abstract 넣기

public abstract class NoteBook extends Computer {
    @Override
    void display() {
        System.out.println("NoteBook display");
    }


}
