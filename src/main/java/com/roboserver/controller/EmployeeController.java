package com.roboserver.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roboserver.model.Employee;
import com.roboserver.services.EmployeeService;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeDao;

  @GetMapping("/employee/get-all")
  public List<Employee> getAllEmployees() {
	  System.out.println("list..");
    return employeeDao.getAllEmployees();
  }

  @PostMapping("/employee/save")
  public Employee save(@RequestBody Employee employee) {
	  System.out.println("save..");
	  employee.validateRequredfeilds();
    //return employeeDao.save(employee);
	  return employeeDao.save(employee);
  }
  @RequestMapping(value = "/{Id}", method = RequestMethod.DELETE)
	public void deleteByEmployee(@PathVariable("Id") int Id) {
		employeeDao.delete(Id);
	}
}
