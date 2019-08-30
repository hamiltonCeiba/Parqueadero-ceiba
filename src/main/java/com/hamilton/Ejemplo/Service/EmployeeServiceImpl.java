package com.hamilton.Ejemplo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hamilton.Ejemplo.EmployeService;
import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Entity.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeService {

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findEmployeeByName(name);
	}
	
}
