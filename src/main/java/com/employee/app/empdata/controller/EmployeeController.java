package com.employee.app.empdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.empdata.entity.Employee;
import com.employee.app.empdata.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/EmployeeData")
	public List<Employee> getEmployee() {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Beulah");
		e.setMobileNo("999");
		employeeRepository.save(e);
		return employeeRepository.findAll();
	}
}
