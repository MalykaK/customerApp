package com.capgemini.employee.Service;

import java.time.LocalDate;

import com.capgemini.employee.entity.Employee;
import com.capgemini.employee.exception.EmployeeNotFoundException;

public interface EmployeeService {
	
	/*public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee findEmployeeById(int employeeId) throws EmployeeNotFoundException ;

	public void deleteEmployee(Employee employee);*/
	public LocalDate date();
}
