package com.sud.firstJunit.service;

import java.util.List;

import com.sud.firstJunit.dto.Employee;

public interface EmployeeService  {
	public List<Employee> getAllEmployee();
	public Employee createNewEmployee(Employee employee);
}
