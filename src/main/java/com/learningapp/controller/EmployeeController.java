package com.learningapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningapp.model.Employee;
import com.learningapp.service.EmployeeService;

@RestController
@RequestMapping("/api/a1")
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice; 
	
	//to get employees 
	@GetMapping("/employees")
	public List<Employee> getallemployees(){
		return employeeservice.getallemployees();
	}
	
	//to add new employee
	@PostMapping("/employees")
	public Employee addemployee(@RequestBody Employee employee) {
		return employeeservice.addemployee(employee);
	}
	
	//to get an employee data by id
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeservice.getemployee(id);
	}
	
	//to update an employee
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id) {
		return employeeservice.updateEmployee(employee, id);
	}
	
	//to delete an employee
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable Long id ) {
		employeeservice.deleteEmployee(id);
		return "Employee deleted";
	}
	

}
