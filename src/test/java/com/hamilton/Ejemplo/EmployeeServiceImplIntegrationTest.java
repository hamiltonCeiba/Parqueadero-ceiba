package com.hamilton.Ejemplo;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamilton.Ejemplo.Entity.Employee;
import com.hamilton.Ejemplo.Repository.EmployeeRepository;
import com.hamilton.Ejemplo.Service.EmployeeService;
import com.hamilton.Ejemplo.Service.ServiceImpl.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

	
	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public EmployeeService employeeService() {
            return new EmployeeServiceImpl();
        }
    }
 
    @Autowired
    private EmployeeService employeeService;
 
    @MockBean
    private EmployeeRepository employeeRepository;
    
    
    @Before
    public void setUp() {
        Employee alex = new Employee("alex");
     
        Mockito.when(employeeRepository.findByName(alex.getName()))
          .thenReturn(alex);
    }
    
    
    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        String name = "alex";
        Employee found = employeeService.getEmployeeByName(name);
        //assertTrue(0==0);
        assertTrue("", found.getName().equals("alex"));
     }
   
    
    
}
