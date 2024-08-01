package br.com.luzaraldi.aspects_java_springaop;

import org.aspectj.langannotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component 

public class LoggingAspect {
    
  @Before("execution(* br.com.luzaraldi.aspects_java_sprintgaop.dummy.*.*()..))")  
  public void logBefore(JoinPoint joinPoint) {
    System.out.println("Before: " + jointPoint.getSignature());
  }
 
  @Around("execution(* br.com.luzaraldi.aspects_java_springaop.dummy.*.*(..))")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Around Before: " + joinPoint.getSignature());

    Object object = joinPoint.Proceed();

    System.out.println("Around After: " + joinPoint.getSignature());

    return object;

}

}
