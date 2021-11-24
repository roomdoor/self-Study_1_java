package ch21;

public class BookTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];
//
//        for(int i = 0; i < library.length; i++){
//            System.out.println(library[i]);//
//       }

        library[0] = new Book("원피스1", "일본 놈");
        library[1] = new Book("원피스2", "일본 놈");
        library[2] = new Book("원피스3", "일본 놈");
        library[3] = new Book("원피스4", "일본 놈");
        library[4] = new Book("원피스5", "일본 놈");

        for(Book book : library){
            System.out.println(book);
            book.showInfor();
        }



    }

}
