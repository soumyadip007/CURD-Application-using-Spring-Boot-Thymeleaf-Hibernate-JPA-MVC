package com.spring.boot.thymeleaf.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.thymeleaf.controller.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
