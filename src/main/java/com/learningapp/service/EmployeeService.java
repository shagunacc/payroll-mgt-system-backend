package com.learningapp.service;

import java.util.List;

import com.learningapp.model.Employee;

public interface EmployeeService {
	
	List<Employee> getallemployees();
	Employee addemployee(Employee employee);
	Employee updateEmployee(Employee employee,Long id);
	void deleteEmployee(Long id);
	Employee getemployee(Long id);

}
