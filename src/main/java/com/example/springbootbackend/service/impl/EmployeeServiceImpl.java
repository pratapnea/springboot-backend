package com.example.springbootbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.model.Employee;
import com.example.springbootbackend.repository.EmployeeRepository;
import com.example.springbootbackend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	/*
	 * Starting from Spring 4.3, if a class, which is configured as a Spring Bean,
	 * has only one constructor, the @Autowired annotation can be omitted and Spring
	 * will use the constructor and inject all necessary dependencies;
	 */
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) return employee.get();
//		else throw new ResourceNotFoundException("Employee", "Id", id);
		
		return this.employeeRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id) );
		
	}
	

}














































