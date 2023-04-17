package com.learningapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningapp.model.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary,Long>{

}
