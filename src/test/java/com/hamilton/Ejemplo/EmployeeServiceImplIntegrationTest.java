package com.hamilton.Ejemplo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamilton.Ejemplo.Entity.EmployeeRepository;
import com.hamilton.Ejemplo.Service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

	
	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public EmployeService employeeService() {
            return new EmployeeServiceImpl();
        }
    }
 
    @Autowired
    private EmployeService employeeService;
 
    @MockBean
    private EmployeeRepository employeeRepository;
}
