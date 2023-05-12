package com.employee.app.empdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.empdata.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
