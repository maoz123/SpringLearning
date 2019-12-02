package com.learning.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TestAop {

    @Pointcut("execution(public * com.learning.dao.DaoImpl2.print())")
    public void create()
    {

    }

    @Before(value="create()")
    public void print()
    {
        System.out.println("advice executes");
    }
}
