package aop;

import org.springframework.stereotype.Component;

@Component
public class UniverLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println(" - мы берем книгу в UniverLibrary. ");
    }

    public void returnBook(){
        System.out.println(" - мы возвращаем книгу в UniverLibrary. ");

    }
//    public String returnBook(){
//        System.out.println(" - мы возвращаем книгу в UniverLibrary = Ok!. ");
//        return "Ok!";
//    }

    public void getMagazine() {
        System.out.println(" - мы берем журнал в UniverLibrary.  ");
    }

    public void returnMagazine(){
        System.out.println(" - мы возвращаем журнал в UniverLibrary. ");

    }

    public void addBook() {
        System.out.println(" - мы добовляем книгу в UniverLibrary. ");
    }

    public void removeBook() {
        System.out.println(" - мы изымаем из книжного фонда UniverLibrary книгу . ");
    }

    public void addMagazine(){
        System.out.println(" - мы добавляем журнал в UniverLibrary. ");
    }

}
