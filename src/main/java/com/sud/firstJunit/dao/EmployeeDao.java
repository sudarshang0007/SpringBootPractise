package com.sud.firstJunit.dao;

import org.springframework.data.repository.CrudRepository;

import com.sud.firstJunit.dto.Employee;
import com.sud.firstJunit.entity.EmployeeEntity;

public interface EmployeeDao extends CrudRepository<EmployeeEntity, Long> {

}
