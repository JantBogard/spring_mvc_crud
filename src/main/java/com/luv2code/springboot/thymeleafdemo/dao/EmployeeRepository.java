package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

	// add methode to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
}
