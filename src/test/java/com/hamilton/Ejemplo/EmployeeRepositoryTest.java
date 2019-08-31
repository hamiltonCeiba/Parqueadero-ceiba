package com.hamilton.Ejemplo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private EmployeeRepository employeeRepositoryTest;

	@Test
	public void whenFindName_thenReturnEmployee() {
		Employee employ = new Employee("alex");
		employeeRepositoryTest.save(employ);
		
		Employee found = employeeRepositoryTest.findByName("alex");
		
		assertTrue("", found.getName().equals("alex"));
		
	}
}
