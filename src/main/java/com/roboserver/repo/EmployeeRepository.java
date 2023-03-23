package com.roboserver.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roboserver.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	//Employee findByName(String name);

	Employee findByName(String name);

	//Employee findByame(String name);

}