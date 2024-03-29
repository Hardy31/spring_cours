package aop.aspects.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyPointcuts {
    @Pointcut("execution( * add*(..))")
    void   allAddMethod(){}


//@Component
//@Aspect
//public class MyPointcuts {
//    @Pointcut("execution( * get*())")
//    void   allGetMethod(){}

}
