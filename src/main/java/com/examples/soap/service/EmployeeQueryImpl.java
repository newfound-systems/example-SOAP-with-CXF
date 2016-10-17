/**
 * Copyright NEWFOUND SYSTEMS to Present
 * All Rights Reserved
 */
package com.examples.soap.service;

import javax.jws.WebService;

import com.examples.model.Employee;
import com.examples.model.EmployeeList;

@WebService(endpointInterface = "com.examples.soap.service.EmployeeQuery")
public class EmployeeQueryImpl implements EmployeeQuery {

	static final EmployeeList employeeList = new EmployeeList();
	static {
		Employee employee;

		employee = new Employee();
		employee.setId(1);
		employee.setFullName("Chetan");
		employee.setLocation("Bangalore");

		employeeList.getEmployee().add(employee);

		employee = new Employee();
		employee.setId(2);
		employee.setFullName("Amit");
		employee.setLocation("Singapore");

		employeeList.getEmployee().add(employee);

		employee = new Employee();
		employee.setId(3);
		employee.setFullName("Akhil");
		employee.setLocation("Phoenix");

		employeeList.getEmployee().add(employee);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.soap.service.EmployeeQuery#query(int)
	 */
	public Employee query(int id) {
		for (Employee employee : employeeList.getEmployee()) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.soap.service.EmployeeQuery#queryAll()
	 */
	public EmployeeList queryAll() {
		return employeeList;
	}
}
