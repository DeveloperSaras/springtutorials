package com.sks.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name,surname)")
	public void getNameAfterAdvice(String name, String surname) {
		
		System.out.println("After advice being executed.");
		System.out.println("Passed argument are : " + name + " " + surname);
	}
	
	@AfterThrowing("within(com.sks..*)")
	public void logException(JoinPoint joinPoint) {
		System.out.println("Exception is thrown in class at : " + joinPoint.toString());
		
	}
	

	
	/*
	 * @After("execution(* *.getName())") public void getNameAfterAdvice() {
	 * System.out.println("Executing after advice for getName method.");
	 * 
	 * }
	 * 
	 * @After("args(name)") public void getNameAfterSecondAdvice(String name) {
	 * System.out.
	 * println("Executing second after advice for setName method. Passed argument is : "
	 * + name);
	 * 
	 * }
	 * 
	 * @After("args(name, surName)") public void getNameAfterThirdAdvice(String
	 * name, String surName) {
	 * System.out.println("Executing third after advice for setFullName method. " +
	 * "Passed argument are : " + name + " " + surName);
	 * 
	 * }
	 * 
	 * @AfterThrowing("within(com..*)") public void logExceptions(JoinPoint
	 * joinPoint) {
	 * 
	 * System.out.println("Exception occured at : " + joinPoint.toString()); }
	 * 
	 * @AfterReturning(pointcut = "execution(public String getName())", returning =
	 * "returnString") public void getNameAfterReturningAdvice(String returnString)
	 * {
	 * 
	 * System.out.
	 * println("Executing After Returning getName advice. Return String is : " +
	 * returnString); }
	 */

}
