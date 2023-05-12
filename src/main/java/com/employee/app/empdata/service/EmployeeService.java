package com.employee.app.empdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.empdata.entity.Employee;
import com.employee.app.empdata.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee add(Employee employee) {
		return employeeRepository.save(employee);
	}
}
