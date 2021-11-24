package ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] CopyLibrary = new Book[5];

        library[0] = new Book("원피스1", "일본");
        library[1] = new Book("원피스2", "일본");
        library[2] = new Book("원피스3", "일본");
        library[3] = new Book("원피스4", "일본");
        library[4] = new Book("원피스5", "일본");


        // 이렇게 하면 배열의 주소도 달라지고 원본을 바꿔도 카피가 비뀌자 않게 된다.
        CopyLibrary[0] = new Book();
        CopyLibrary[1] = new Book();
        CopyLibrary[2] = new Book();
        CopyLibrary[3] = new Book();
        CopyLibrary[4] = new Book();

        for(int i = 0; i<CopyLibrary.length; i++){
            CopyLibrary[i].setTitle(library[i].getTitle());
            CopyLibrary[i].setAuthor((library[i].getAuthor()));
        }

//        System.arraycopy(library, 0, CopyLibrary, 0, 5); // 배열 복사하는 법
//        System.out.println("======library======");
//        for(Book book : library){
//            System.out.println(book);
//            book.showInfor();
//        }
//
//        System.out.println("======copy library======"); // 배열 복사한거 보면 주소도 똑같이 복사됨
//        for(Book book : CopyLibrary){
//            System.out.println(book);
//            book.showInfor();
//        }
        System.out.println("======library======");
        library[0].setAuthor("이시화");
        library[0].setTitle("책제목");
        for(Book book : library){
            System.out.println(book);
            book.showInfor();
        }

        System.out.println("======copy library======");
        for(Book book : CopyLibrary){  // 복사 되었지만 인스턴스를 가르치는 주소가 같기 때문에 원본을 카피하면 복사본도 바뀐다
            System.out.println(book);   // 이거 싫으면 copy library 생성 후 배열에 new Book()을 모두 넣어주면 된다
            book.showInfor();
        }





    }
}
