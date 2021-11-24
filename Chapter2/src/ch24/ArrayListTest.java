package ch24;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("원피스1" , "일본"));
        library.add(new Book("원피스2" , "일본"));
        library.add(new Book("원피스3" , "일본"));
        library.add(new Book("원피스4" , "일본"));
        library.add(new Book("원피스5" , "일본"));
        library.add(new Book("원피스6" , "일본"));

        for(int i=0; i<library.size(); i++){
            library.get(i).showInfor();
        }
        System.out.println(library.size());
    }

}
