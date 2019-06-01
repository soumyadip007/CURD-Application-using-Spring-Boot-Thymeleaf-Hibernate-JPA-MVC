package com.spring.boot.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.thymeleaf.controller.entity.Employee;
import com.spring.boot.thymeleaf.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


	private EmployeeService employeeService;
	
	
	//inject employee dao
	@Autowired
	public EmployeeController(EmployeeService obj)
	{
		employeeService=obj;
	}
	
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		List<Employee> list=employeeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", list);
		
		return "list";
	}
}









