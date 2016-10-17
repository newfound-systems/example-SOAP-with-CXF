/**
 * Copyright NEWFOUND SYSTEMS to Present
 * All Rights Reserved
 */
package com.examples.soap.client;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.examples.model.Employee;
import com.examples.model.EmployeeList;
import com.examples.soap.service.EmployeeQuery;
import com.examples.soap.service.EmployeeQueryImplService;

public class EmployeeQuerySoapClient {

	/**
	 * Marshall Employee
	 * 
	 * @param employee
	 */
	private static void marshallEmployee(Employee employee) {
		System.out.println("\n--- Writing xml to String...");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter writer = new StringWriter();
			marshaller.marshal(employee, writer);

			System.out.println(writer.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Marshall Employees
	 * 
	 * @param employees
	 */
	private static void marshallEmployee(EmployeeList employees) {
		System.out.println("\n--- Writing xml to String...");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeList.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter writer = new StringWriter();
			marshaller.marshal(employees, writer);

			System.out.println(writer.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeQueryImplService employeeQueryImplService = new EmployeeQueryImplService();
		/**
		 * Get Port
		 */
		EmployeeQuery soapClient = employeeQueryImplService.getEmployeeQueryImplPort();
		/**
		 * Query Single Employee
		 */
		Employee employee = soapClient.query(1);
		System.out.println("Response (Single Employee): " + employee);
		/**
		 * Marshall Java to XML
		 */
		marshallEmployee(employee);
		/**
		 * Query All Employees
		 */
		EmployeeList employees = soapClient.queryAll();
		for (Employee e : employees.getEmployee()) {
			System.out.println("Response (All Employees): " + e);
		}
		/**
		 * Marshall Java to XML
		 */
		marshallEmployee(employees);
	}
}
