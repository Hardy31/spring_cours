package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

////    @Pointcut("execution(* aop.UniverLibrary.get*())")
//    @Pointcut("execution( * get*())")
//    private void allGetMethodfromUniverLibrary() {}
//
//    @Pointcut("execution (* return*())")
//    private void allReturnMethod(){}
//
//    @Pointcut("execution(* dd*(..))")
//    private  void allAddMethod() {}
//
//    @Pointcut("execution(* remove*(..))")
//    private void allRemoveMethod() {}
//
//
//    @Pointcut("allGetMethodfromUniverLibrary() || allReturnMethod()" )
//    private void allGetAndReturnMethod(){}
//
//    @Before("allGetMethodfromUniverLibrary()")
//    public void beforeGetLogingAdvice() {
//        System.out.println("Before/allGetMethodfromUniverLibrary() Класса LoggingAndSecurityAspect->beforeGetLoggingAdviсe()  - writing Log #1 " );
//    }
//
//    @Before("allReturnMethod()")
//    public void beforeReturnLogingAdvice(){
//        System.out.println("Before/allReturnMethod() Класса LoggingAndSecurityAspect->beforeReturnLogingAdvice()  - writing Log #2 " );
//    }
//
//    @Before("allGetAndReturnMethod()")
//    public void beforeGerAndReturnMethod(){
//        System.out.println("Before/allGetAndReturnMethod() Класса LoggingAndSecurityAspect->beforeGerAndReturnMethod() - writing Log #1 and 2");
//    }

















//    @Pointcut("execution( * get*())")
//    private void   allGetMethod(){}  //ссылка на pointcut названа allGetMethod() потому что она описывает вызов всех методов начинающихся на GETбез параметров.
//                                    //если его сделать public то его  можно будет применятьи в других Aspect классах
//
//    @Before("allGetMethod()")
//    public void beforeGetLoggingAdviсe(){
//        System.out.println( "Before/pointcut execution(* get*()) Класса LoggingAndSecurityAspect->beforeGetLoggingAdviсe()  - Логирование: попытка получить книгу или журнал "  );
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println( "Before/pointcut execution(* get*()) Класса LoggingAndSecurityAspect->beforeGetSecurityAdvice()  - проверка прав на получение книги или журнала "  );
//    }

}
