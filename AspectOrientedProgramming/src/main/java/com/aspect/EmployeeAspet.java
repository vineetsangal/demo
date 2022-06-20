package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class EmployeeAspet {
	{  
		@Before(value = "execution(* com.javatpoint.service.EmployeeService.*(..)) and args(empId, fname, sname)")  
		public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
		System.out.println("Before method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
		}  
		}  

}
