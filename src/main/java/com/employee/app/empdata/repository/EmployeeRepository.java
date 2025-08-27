package com.employee.app.empdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.empdata.entity.Employee;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
