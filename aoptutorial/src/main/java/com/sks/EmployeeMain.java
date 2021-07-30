package com.sks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sks.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeService service = (EmployeeService) context.getBean("empService");

		service.getName();
		
		try {
		service.setName("Ram Kumar");
		}catch(Exception e) {
			System.out.println("Exception handled for service class getName method.");
			
		}
		
		
		
		Employee emp = service.getEmployee();

		String name = emp.getName();
		
		try {
		emp.setName("Amar");
		}catch(Exception e) {
			System.out.println("Exception handled for name Amar.");
		}
		
		emp.setFullName("Rashid", "Khan");
		
		
		System.out.println(name);

		/*
		 * Employee emp = service.getEmployee(); try { emp.setName("Javed"); } catch
		 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * emp.setFullName("Arjun", "Kumar");
		 * 
		 * name = service.getEmployee().getName();
		 * 
		 * System.out.println(name);
		 * 
		 * try { emp.setName("Amar"); } catch (Exception e) {
		 * System.out.println("Exception handled."); } try { service.setName("Abc"); }
		 * catch (Exception e) {
		 * System.out.println("Exception handled for service class setName method."); }
		 */
		 
		 context.close();

	}

}
