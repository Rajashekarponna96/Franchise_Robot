package com.roboserver.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.roboserver.common.CommonException;
import com.roboserver.common.CommonExceptionMessage;
import com.roboserver.model.Employee;
import com.roboserver.repo.EmployeeRepository;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository repository;

  public Employee save(Employee employee) {
	  
//	  UserInfo userInfo = userInfoRepository.findByUsername(userInfoRequest.getUsername());
	  Employee employee1 = repository.findByName(employee.getName());
		if (employee != null) {
			throw CommonException.CreateException(CommonExceptionMessage.ALREADY_EXISTS, "name");
		}
	  
//	  employee=repository.findByName(employee.getName());
//	  if(employee != null) {
//		  
//		  throw CommonException.CreateException(CommonExceptionMessage.ALREADY_EXISTS,"name");
//	  }
	//return employee;
	  return repository.save(employee);
  }

  public List<Employee> getAllEmployees() {
    List<Employee> employees = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(employees::add);
    return employees;
  }

  public void delete(int employeeId) {
    repository.deleteById(employeeId);
  }
}
