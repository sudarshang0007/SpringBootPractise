package com.sud.firstJunit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sud.firstJunit.dao.EmployeeDao;
import com.sud.firstJunit.dto.Employee;
import com.sud.firstJunit.entity.EmployeeEntity;

@Service
public class EmployServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private ModelMapper mapper;

	public List<Employee> getAllEmployee() {
		List<EmployeeEntity> employees = (List<EmployeeEntity>) employeeDao.findAll();
		return employees.stream().map(emp -> mapToEmployee(emp)).collect(Collectors.toList());
	}

	private Employee mapToEmployee(EmployeeEntity emp) {
		return mapper.map(emp, Employee.class);
	}

	private EmployeeEntity mapToEntity(Employee employee) {
		return mapper.map(employee,EmployeeEntity.class);
	}
	
	@Override
	public Employee createNewEmployee(Employee employee) {
		EmployeeEntity empEntity = mapToEntity(employee);
		return mapToEmployee(employeeDao.save(empEntity));
	}

}
