package aop;

import org.springframework.stereotype.Component;

@Component
public class UniverLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println(" - мы берем книгу в UniverLibrary. ");
        System.out.println("______________________________________");
    }

    public void returnBook(){
        System.out.println(" - мы возвращаем книгу в UniverLibrary. ");
        System.out.println("______________________________________");

    }
//    public String returnBook(){
//        System.out.println(" - мы возвращаем книгу в UniverLibrary = Ok!. ");
//        return "Ok!";
//    }

    public void getMagazine() {
        System.out.println(" - мы берем журнал в UniverLibrary.  ");
        System.out.println("______________________________________");
    }

    public void returnMagazine(){
        System.out.println(" - мы возвращаем журнал в UniverLibrary. ");
        System.out.println("______________________________________");

    }

    public void addBook(String personName, Book book) {
        System.out.println(" - мы добовляем книгу в UniverLibrary. ");
        System.out.println("______________________________________");
    }

    public void removeBook() {
        System.out.println(" - мы изымаем из книжного фонда UniverLibrary книгу . ");
        System.out.println("______________________________________");
    }

    public void addMagazine(){
        System.out.println(" - мы добавляем журнал в UniverLibrary. ");
        System.out.println("______________________________________");
    }

}
