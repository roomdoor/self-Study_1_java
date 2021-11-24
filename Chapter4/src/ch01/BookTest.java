package ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("원피스","일본놈");
        System.out.println(book);

        String str = new String("Test");
        System.out.println(str); // 이미 toString() 으로 오버라이딩 되어있어서 그냥 문자로 나옴


    }
}
