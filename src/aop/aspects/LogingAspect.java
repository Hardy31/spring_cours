package aop.aspects;



import aop.AbstractLibrary;
import aop.MyConfig;
import aop.UniverLibrary;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogingAspect {





//    @Before("execution(public void getBook(aop.Book))")
//    public void beforeGetBookGetNameAdvise(){
//        System.out.println( "Вызов метода Pointcut execution(public void getBook(*)) класса LogingAspect - попытка получить книгу с передачей обекта  Book"  );
//    }
//
//
//    @Before("execution(public void getBook())")
//    public void beforeGetBookAdvise(){
//        System.out.println( "Вызов метода beforeGetBookAdvise() класса LogingAspect - попытка получить книгу"  );
//    }
//
//
//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookNameAdvise(){
//        System.out.println( "Вызов метода beforeGetBookAdvise(String) класса LogingAspect - попытка получить книгу с названием"  );
//    }
//
//
//    @Before("execution(public void aop.UniverLibrary.getBook())")
//    public void beforeUniverLibraru_GetBookAdvise(){
//        System.out.println( "Вызов метода beforeUniverLibraru_GetBookAdvise() класса LogingAspect - попытка получить книгу");
//    }
//
//
//    @Before("execution(public void get*())")
//    public void beforeGetMethodAdvise(){
//        System.out.println( "Вызов метода beforeGetMethodAdvise() класса LogingAspect - попытка получить что либо");
//    }
//
//
//    @Before("execution(public void returnBook())")
//    public void returnBookAdvise(){
//        System.out.println( "Вызов метода returnBookAdvise() класса LogingAspect - попытка вернуть книгу");
//    }
//
//
//    @Before("execution(public * returnBook())")
//    public void returnBookAdvise(){
//        System.out.println( "Вызов метода returnBookAdvise() класса LogingAspect - попытка вернуть книгу");
//    }
}
