package com.learningapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningapp.model.Employee;
import com.learningapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	@Override
	public List<Employee> getallemployees(){
		return (List<Employee>)employeerepo.findAll();
		
	}

	@Override
	public Employee addemployee(Employee employee) {
		
		return employeerepo.save(employee);
	}
	@Override
	public Employee getemployee(Long id) {
		// TODO Auto-generated method stub
		return employeerepo.findById(id).get();
	}
	

	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		// TODO Auto-generated method stub
		Employee updatedemp= employeerepo.findById(id).get();
		updatedemp.setId(employee.getId());
		updatedemp.setName(employee.getName());
		updatedemp.setDepartment(employee.getDepartment());
		updatedemp.setContact(employee.getContact());
		updatedemp.setEmail(employee.getEmail());
		return employeerepo.save(updatedemp);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeerepo.deleteById(id);
	}

	
	

}
