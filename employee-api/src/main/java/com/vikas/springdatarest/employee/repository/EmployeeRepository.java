package com.vikas.springdatarest.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikas.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
