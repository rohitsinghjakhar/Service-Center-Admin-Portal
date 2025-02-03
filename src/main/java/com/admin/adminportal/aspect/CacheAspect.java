package com.admin.adminportal.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CacheAspect {

    //@Around("execution(* com.admin.adminportal.service.*.*(..))")
    public void execute(ProceedingJoinPoint proceedingJoinPoint) // for get all the details of target class.
    {
        String className = proceedingJoinPoint.getTarget().getClass().getName();
        String methodName = proceedingJoinPoint.getSignature().getName();
        String mobNum = (String) proceedingJoinPoint.getArgs()[0];

        System.out.println("Class Name :" + className);
        System.out.println("Method Name :" + methodName);
        System.out.println("Mobile Number : "+ mobNum);
    }

}
