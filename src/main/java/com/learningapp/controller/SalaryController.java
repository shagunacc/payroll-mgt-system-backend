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
import org.springframework.web.bind.annotation.RestController;

import com.learningapp.model.Salary;
import com.learningapp.service.SalaryService;

@RestController
@RequestMapping("/api/a1")
@CrossOrigin
public class SalaryController {
	
	@Autowired
	private SalaryService salaryservice;
	
	//get salary report of all employees
	@GetMapping("/salary")
	public List<Salary> getsalaries(){
		return salaryservice.getallsalary();
		
	}
	//adding a new salary report
	@PostMapping("/salary")
	public Salary addsalaryreport(@RequestBody Salary salary ) {
		return salaryservice.addsalaryreport(salary);
	}
	
	//getting the salary report of a particular employee
	@GetMapping("/salary/{id}")
	public Salary getsalaryreport(@PathVariable Long id) {
		return salaryservice.getsalaryreport(id);
	}
	
	//update any one of the salary report
	@PutMapping("/salary/{id}")
	public Salary updatesalaryreport(@RequestBody Salary salary,@PathVariable Long id) {
		return salaryservice.updatesalaryreport(salary, id);
	}
	
	//to delete any one of the existing report
	@DeleteMapping("/salary/{id}")
	public String deletereport(@PathVariable  Long id) {
		salaryservice.deletesalaryreport(id);
		return "salary report successfully deleted";
	}

}
