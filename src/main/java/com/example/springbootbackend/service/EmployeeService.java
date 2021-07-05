package com.example.springbootbackend.service;

import java.util.List;

import com.example.springbootbackend.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long userId);
	Employee updateEmployee(Employee employee, long userId);

}
