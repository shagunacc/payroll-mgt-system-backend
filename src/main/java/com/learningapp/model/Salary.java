package com.learningapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Salary")
public class Salary {
	
	@Id
	private Long id;
	private String name;
	private double hra;
	private double ta;
	private int psdays;
	private double amtperday;
	private double tsalary=0.0;
	
	
	
	public Salary() {
	
	}
	public Salary(Long id, String name, double hra, double ta, int psdays, double amtperday, double tsalary) {
		
		this.id = id;
		this.name = name;
		this.hra = hra;
		this.ta = ta;
		this.psdays = psdays;
		this.amtperday = amtperday;
		this.tsalary = tsalary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public int getPsdays() {
		return psdays;
	}
	public void setPsdays(int psdays) {
		this.psdays = psdays;
	}
	public double getAmtperday() {
		return amtperday;
	}
	public void setAmtperday(double amtperday) {
		this.amtperday = amtperday;
	}
	public double getTsalary() {
		return tsalary;
	}
	public void setTsalary(double tsalary) {
		this.tsalary = tsalary;
	}
	
	
}
    
	
	