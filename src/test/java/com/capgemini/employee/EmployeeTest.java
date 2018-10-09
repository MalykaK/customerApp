package com.capgemini.employee;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.capgemini.employee.Service.EmployeeService;
import com.capgemini.employee.controller.employeeController;
import com.capgemini.employee.entity.Employee;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EmployeeTest {

	
		@Mock
		private EmployeeService employeeService;

		@InjectMocks
		private employeeController employeeController;

		private MockMvc mockMvc;
		@Before
		public void setUp() {
			MockitoAnnotations.initMocks(this);
			mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
		}
	/*	@Test
		public void testAddEmployee() throws Exception
		{
			when(employeeService.addEmployee(Mockito.isA(Employee.class))).thenReturn(new Employee(1234,"Malyka"));
			mockMvc.perform(post("/employee").
					 	contentType(MediaType.APPLICATION_JSON_UTF8)
					 	.content("{\"employeeId\":1234, \"employeeName\":\"Malyka\"}")
					 	.accept(MediaType.APPLICATION_JSON))
					 	.andExpect(status().isOk())
					 	.andExpect(jsonPath("$.employeeId").exists())
					 	.andExpect(jsonPath("$.employeeName").exists())
					 	.andDo(print());	
		}*/
	
		@Test
		public void testSalary() {
			when(employeeService.date(Mockito.isA(Employee.class))).then return(n)
					
					  /* mockDateSomeHow(Date.class).when(getTime()).return(30);
					   assertEquals(60,new ClassToTest().getDoubleTime());*/
					}
		}
}

