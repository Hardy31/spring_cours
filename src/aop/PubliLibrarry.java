package aop;

import org.springframework.stereotype.Component;

@Component
public class PubliLibrarry {


    public void getBook(Book book) {
        System.out.println(" - мы берем книгу в PubliLibrarry " + book.getName());
    }
//    public void getBook(String bookName) {
//        System.out.println(" - мы берем книгу в PubliLibrarry " + bookName);
//    }
//
//    public void getMagazine() {
//        System.out.println(" - мы берем журнал в PubliLibrarry.  ");
//    }
//
//
//    public String returnBook(){
//        System.out.println(" - мы возвращаем книгу в PubliLibrarry = Ok!. ");
//        return "Ok!";
//    }

}
