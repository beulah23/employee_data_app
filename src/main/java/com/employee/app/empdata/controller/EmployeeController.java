package com.employee.app.empdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.empdata.entity.Employee;
import com.employee.app.empdata.repository.EmployeeRepository;
import com.employee.app.empdata.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;

	private EmployeeRepository employeeRepository;

	@PostMapping("/Employeedetails")
	public void contact(@RequestBody Employee employee) {
		employeeservice.add(employee);
	}

	@GetMapping("/EmployeeData")
	public List<Employee> getEmployee(Employee employee) {
		return employeeRepository.findAll();
	}
}
