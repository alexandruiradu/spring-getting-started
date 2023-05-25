package ro.sda.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MathAspect {

    @Before("execution(* ro.sda.spring.services.MathService.*(..))")
    public void before(){
        System.out.println("@Before advice: A method from MathService was called");
    }

    @After("execution(* ro.sda.spring.services.MathService.*(..))")
    public void after(){
        System.out.println("@After advice: method from MathService has just finished its execution.");
    }

    @AfterThrowing("execution(* ro.sda.spring.services.MathService.*(..))")
    public void actionOnException(){
        System.out.println("@AfterThrowing advice: An exception was thrown!");
    }

    @AfterReturning("execution(* ro.sda.spring.services.MathService.*(..))")
    public void actionOnReturn(){
        System.out.println("@AfterReturn advice: A method from MathService class has returned");
    }


}
