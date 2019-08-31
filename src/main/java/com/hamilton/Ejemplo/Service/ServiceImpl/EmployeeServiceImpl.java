package com.hamilton.Ejemplo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Repository.EmployeeRepository;
import com.hamilton.Ejemplo.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 
	public EmployeeServiceImpl() {
		
	}
	
    @Autowired
    private EmployeeRepository employeeRepository;
 
    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

	/*@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}*/
}
