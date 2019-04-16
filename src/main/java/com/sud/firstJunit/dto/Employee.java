package com.sud.firstJunit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor()
@Getter
@Setter
@NoArgsConstructor
public class Employee {
	private Long empId;
	private String empName;
}
