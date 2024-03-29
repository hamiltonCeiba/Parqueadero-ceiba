package com.hamilton.Ejemplo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamilton.Ejemplo.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name);
	
	//public List<Employee> getAllEmployees();
}
