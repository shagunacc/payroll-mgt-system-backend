package com.learningapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningapp.model.Salary;
import com.learningapp.repository.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	private SalaryRepository salaryrepo;

	@Override
	public List<Salary> getallsalary() {
		// TODO Auto-generated method stub
		return (List<Salary>)salaryrepo.findAll();
	}
	
	@Override
	public Salary getsalaryreport(Long id) {
		// TODO Auto-generated method stub
		return salaryrepo.findById(id).get();
	}

	@Override
	public Salary addsalaryreport(Salary salary) {
		Salary sal=new Salary();
		
		sal.setId(salary.getId());
		sal.setName(salary.getName());
		sal.setAmtperday(salary.getAmtperday());
		sal.setHra(salary.getHra());
		sal.setPsdays(salary.getPsdays());
		sal.setTa(salary.getTa());
		
		sal.setTsalary(salary.getPsdays()*salary.getAmtperday()+salary.getHra()+salary.getTa());
		
		return salaryrepo.save(sal);
	}

	@Override
	public Salary updatesalaryreport(Salary salary, Long id) {
		
	
		// TODO Auto-generated method stub
		Salary updatedsal=salaryrepo.findById(id).get();
		updatedsal.setId(salary.getId());
		updatedsal.setName(salary.getName());
		updatedsal.setTa(salary.getTa());
		updatedsal.setHra(salary.getHra());
		updatedsal.setAmtperday(salary.getAmtperday());
		updatedsal.setPsdays(salary.getPsdays());
		
		updatedsal.setTsalary(salary.getPsdays()*salary.getAmtperday()+salary.getHra()+salary.getTa());
		
		return salaryrepo.save(updatedsal);
	}

	@Override
	public void deletesalaryreport(Long id) {
		// TODO Auto-generated method stub
	 salaryrepo.deleteById(id);	
	}



}
