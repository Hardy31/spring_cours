package aop.aspects.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


    @Before("aop.aspects.order.MyPointcuts.allAddMethod()")
    public void beforeAddLoggingAdviсe(JoinPoint joinPoint ){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] arguments = (Object[])  joinPoint.getArgs();
        System.out.println("____"+methodSignature.toString() + " ___  "+  arguments[0].toString());



        System.out.println( "Before/pointcut execution(* add*(..)) Класса LoggingAspect->beforeAddLoggingAdviсe()  - Логирование: попытка получить книгу или журнал "  );
    }


//    @Before("aop.aspects.order.MyPointcuts.allGetMethod()")
//    public void beforeGetLoggingAdviсe(){
//        System.out.println( "Before/pointcut execution(* get*()) Класса LoggingAspect->beforeGetLoggingAdviсe()  - Логирование: попытка получить книгу или журнал "  );
//    }
}
