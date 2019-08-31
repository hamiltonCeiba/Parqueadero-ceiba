package com.hamilton.Ejemplo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hamilton.Ejemplo.Application;
import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Service.EmployeeService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	/*@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}*/
	
	@CrossOrigin
	@RequestMapping(
			value ="/employee/{name}",
			method=RequestMethod.GET,
			produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Employee getEmployeByName(String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	
}
