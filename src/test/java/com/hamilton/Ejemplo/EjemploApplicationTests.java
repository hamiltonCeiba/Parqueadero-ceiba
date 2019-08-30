package com.hamilton.Ejemplo;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Entity.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjemploApplicationTests {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void whenFindName_thenReturnEmployee() {
		Employee employ = new Employee("Alex");
		entityManager.persist(employ);
		entityManager.flush();
		
		Employee found = employeeRepository.findEmployeeByName(employ.getName());
		
		assertTrue("", found.getName().equals("Alex"));
		
	}
}
