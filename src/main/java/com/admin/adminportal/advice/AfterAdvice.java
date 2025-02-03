package com.admin.adminportal.advice;

import com.admin.adminportal.validator.Validate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAdvice {

    @Autowired
    private Validate validate;

    //@After("execution(* com.admin.adminportal.service.*.*(..))")
    public void execute(JoinPoint joinPoint) // for get all the details of target class.
    {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        String mobNum = (String) joinPoint.getArgs()[0];


        System.out.println("Class Name :" + className);
        System.out.println("Method Name :" + methodName);
        System.out.println("Mobile Number : "+ mobNum);

        if (validate.validMobNum(mobNum))
        {
            System.out.println("Your Mobile number is valid");
        }
        else
        {
            System.out.println("ERROR !!! Please enter correct Mobile Number");
        }


    }

}
