package com.learningapp.service;

import java.util.List;

import com.learningapp.model.Salary;

public interface SalaryService {
	
	//to get all salary reports from db
	List<Salary> getallsalary();
	// add new report & calculate t.salary
	Salary addsalaryreport(Salary salary);
	//to update a report ,also calculate total during submission
	Salary updatesalaryreport(Salary salary,Long id);
	//to delete a report
	void deletesalaryreport(Long id);
	//to get by id during update
	Salary getsalaryreport(Long id);

}
