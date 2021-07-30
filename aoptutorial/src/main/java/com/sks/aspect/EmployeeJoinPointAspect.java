package com.sks.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeJoinPointAspect {
	
	@Before("execution(* *.getEmployee())")
	public void getEmployeeJoinPointAdvice(JoinPoint joinPoint) {
		System.out.println("Executing Joinpoint advice at : " + joinPoint.toLongString());
	}

}
