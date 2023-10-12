package aop.aspects.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionhandlingAspect {


    @Before("aop.aspects.order.MyPointcuts.allAddMethod()")
    public void beforeAddExceptionAdviсe(){
        System.out.println("Before/pointcut execution(* add*(..)) Класса ExceptionhandlingAspect->beforeAddExceptionAdviсe()  - Ошибка: попытка получить книгу или журнал "  );
    }



//    @Before("aop.aspects.order.MyPointcuts.allGetMethod()")
//    public void beforeGetExceptionAdviсe(){
//        System.out.println("Before/pointcut execution(* get*()) Класса ExceptionhandlingAspect->beforeGetExceptionAdviсe()  - Ошибка: попытка получить книгу или журнал "  );
//    }
}
