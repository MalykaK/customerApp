package com.capgemini.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee.Service.EmployeeService;
import com.capgemini.employee.entity.Employee;
import com.capgemini.employee.exception.EmployeeNotFoundException;

@RestController
public class employeeController {
	private EmployeeService employeeService;
	

	@PostMapping("/employee")
		public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		ResponseEntity<Employee> responseEntity= new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.OK);
		return responseEntity;
	}
		
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		try {
			Employee employeefromdb=employeeService.findEmployeeById(employee.getEmployeeId());
			if(employeefromdb != null)
				return new ResponseEntity<Employee>(employeeService.updateEmployee(employee),HttpStatus.OK);
				}
		catch(EmployeeNotFoundException exception) {
			
		}
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<Employee> findProductById(@PathVariable int employeeId) {
		try {
			Employee employeeFromDb = 
					employeeService.findEmployeeById(employeeId);
			return new ResponseEntity<Employee>(employeeFromDb, HttpStatus.OK);
		}
		catch(EmployeeNotFoundException exception) {
			//logged the exception
		}
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<Employee> deleteProduct(Employee employee) {
		try {
			Employee employeeFromDb = 
					employeeService.findEmployeeById(employee.getEmployeeId());
			if(employeeFromDb != null) {
				employeeService.deleteEmployee(employeeFromDb);
				return new ResponseEntity<Employee>(HttpStatus.OK);
			}
		}
		catch(EmployeeNotFoundException exception) {
			//logged the exception
		}		
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
}
