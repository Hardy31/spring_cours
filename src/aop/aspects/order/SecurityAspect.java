package aop.aspects.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(2)
public class SecurityAspect {



    @Before("aop.aspects.order.MyPointcuts.allAddMethod()")
    public void beforeAddSecurityAdvice(){
        System.out.println( "Before/pointcut execution(* add*(..)) Класса SecurityAspect->beforeAddSecurityAdvice()  - проверка прав на получение книги или журнала "  );
    }



//    @Before("aop.aspects.order.MyPointcuts.allGetMethod()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println( "Before/pointcut execution(* get*()) Класса SecurityAspect->beforeGetSecurityAdvice()  - проверка прав на получение книги или журнала "  );
//    }
}
