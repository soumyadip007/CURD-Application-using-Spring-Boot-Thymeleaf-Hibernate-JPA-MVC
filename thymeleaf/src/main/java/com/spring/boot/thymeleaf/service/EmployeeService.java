package com.spring.boot.thymeleaf.service;

import java.util.List;

import com.spring.boot.thymeleaf.controller.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
