package aop.aspects;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogingAspect {
    @Before("execution(public void getBook())")
//                      Перед выполнение public void getBook()
//                      Point cite это выражение которое указывает когда должен быть выполнен сквозной код
    public void beforeGetBookAdvise(){
//                     Advice (совет) метод который находится в Аспект классе и который определяет, что должно произойти
//                     в нашем случае при вызове  метода Library.getBook().
        System.out.println( "Вызов метода beforeGetBookAdvise() класса LogingAspect - попытка получить книгу");
        System.out.println("Фызусе мы берем книгу. ");
    }
}
