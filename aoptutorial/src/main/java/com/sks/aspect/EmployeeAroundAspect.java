package com.sks.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {
	
	
	@Around("execution(* *.getName())")
	public Object getNameAroudAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object result = null;
		System.out.println("Before executing around advice for getName method.");
		
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("After executing around advice for getName method.");
		
		return result;
	}
	
	
	/*
	 * @Around("execution(* *.getName())") public Object
	 * getNameAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
	 * 
	 * Object result = null;
	 * 
	 * System.out.println("Before Executing around advice for getName method.");
	 * 
	 * try { result = proceedingJoinPoint.proceed(); } catch (Throwable e) {
	 * e.printStackTrace(); }
	 * 
	 * System.out.println("After Executing around advice for getName method.");
	 * 
	 * return result; }
	 */

}
