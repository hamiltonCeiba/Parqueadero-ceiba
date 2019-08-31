package com.hamilton.Ejemplo.Service;


import java.util.List;
import com.hamilton.Ejemplo.Entity.Employee;

public interface EmployeeService {
	
	Employee getEmployeeByName(String name);
	
	//List<Employee> getAllEmployees();
}
