package com.sud.firstJunit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sud.firstJunit.dto.Employee;
import com.sud.firstJunit.service.EmployeeService;

@Controller
@RequestMapping(path= {"/employee"})
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	@ResponseStatus(code=HttpStatus.OK)
	@ResponseBody
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
	
}
