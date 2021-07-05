package com.example.springbootbackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.model.Employee;
import com.example.springbootbackend.service.EmployeeService;



/*
	@RestController is a convenient annotation that combines
	@Controller and @ResponseBody, which eliminates the need 
	to annotate every request handling method of the controller
	class with the @ResponseBody annotation
*/

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	  
	//	build create employee REST API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//	build getAllEmployee REST API
	@GetMapping
	public List<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployee();
	}
	
//	build get employee by id REST API
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable (value = "id") long employeeId) {
		return this.employeeService.getEmployeeById(employeeId);
	}
	
	
}

































