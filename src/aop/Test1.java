package aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniverLibrary univerLibrary = context.getBean("univerLibrary", UniverLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        PubliLibrarry publiLibrarry = context.getBean("publiLibrarry", PubliLibrarry.class);
        Book book = context.getBean("book", Book.class);



        univerLibrary.addBook("Л.Н. Толстой", book);;
//        univerLibrary.getMagazine();





//        univerLibrary.getBook();
//        univerLibrary.getMagazine();



//        univerLibrary.getBook();
//        univerLibrary.getMagazine();
//        univerLibrary.returnMagazine();
//        univerLibrary.addBook();



//        publiLibrarry.getBook(book);
//        publiLibrarry.getBook("Горе от Ума");
//        publiLibrarry.returnBook();
//        publiLibrarry.getMagazine();
//        schoolLibrary.getBook();



        context.close();
    }



}
