package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan ("aop")
@EnableAspectJAutoProxy
            //Включить автоматический прокси-сервер AspectJ
public class MyConfig {
}
