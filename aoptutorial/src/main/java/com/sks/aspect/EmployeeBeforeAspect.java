package com.sks.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeBeforeAspect {
	
	
	/*
	 * @Before("execution(* com.sks.Employee.getName())") public void
	 * getNameBeforeAdvice() {
	 * System.out.println("Executing before advice for getName method."); }
	 * 
	 * @Before("getNamePointCut()") public void getNameBeforeSecondAdvice1() {
	 * System.out.println("Executing Second before advice for getName method."); }
	 * 
	 * @Before("getNamePointCut()") public void getNameThirdAdvice() {
	 * 
	 * System.out.println("Executing third advice."); }
	 */
	
	
	  @Before("getNamePointCut())") 
	  public void getNameJointPointAdvice(JoinPoint
	  joinPoint) {
	  
	  System.out.println("Executing join point advice at location : " +
	  joinPoint.toString()); }
	 
	
	@Pointcut("execution(* *.getName())")
	public void getNamePointCut() {
		
	}
	
	
	/*
	 * @Before("execution(* com.sks.Employee.get*())") public void
	 * getAllMethodBeforeAdvice() {
	 * System.out.println("Executing all methods advice."); }
	 * 
	 * @Before("getNamePointCut()") public void getNamePointcutAdvice() {
	 * System.out.println("Executing pointcut advice for getEmployee method."); }
	 * 
	 * @Pointcut("execution(* com.sks.service.EmployeeService.getEmployee())")
	 * public void getNamePointCut() {
	 * 
	 * }
	 */

}
