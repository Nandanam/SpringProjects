package com.vikas.springdatarest.dept.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikas.springdatarest.dept.entities.Department;

public interface DepartmentRepo extends CrudRepository<Department, Long> {

}
