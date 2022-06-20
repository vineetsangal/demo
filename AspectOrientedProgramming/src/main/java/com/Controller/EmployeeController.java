package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	private String firstName;
	private String secondName;
	@GetMapping("/add/employee")
	
	public com.model.Employee addEmployee(@RequestParam("empId") String empId){ 
		return employeeservice.createEmployee(empId, firstName, secondName);
		public String removeEmployee( @RequestParam("empId") String empId)   
		{  
		employeeservice.deleteEmployee(empId);  
		return "Employee removed";  
	}
	
	

}
