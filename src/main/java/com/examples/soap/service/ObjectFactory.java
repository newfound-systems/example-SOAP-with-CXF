
package com.examples.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.examples.model.Employee;
import com.examples.model.EmployeeList;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.examples.soap.service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _EmployeeArray_QNAME = new QName("http://service.soap.examples.com/", "employeeArray");
	private final static QName _Employees_QNAME = new QName("http://service.soap.examples.com/", "Employees");
	private final static QName _Employee_QNAME = new QName("http://service.soap.examples.com/", "employee");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.examples.soap.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link EmployeeList }
	 * 
	 */
	public EmployeeList createEmployeeList() {
		return new EmployeeList();
	}

	/**
	 * Create an instance of {@link Employee }
	 * 
	 */
	public Employee createEmployee() {
		return new Employee();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeList }
	 * {@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.soap.examples.com/", name = "Employees")
	public JAXBElement<EmployeeList> createEmployees(EmployeeList value) {
		return new JAXBElement<EmployeeList>(_Employees_QNAME, EmployeeList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Employee }
	 * {@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.soap.examples.com/", name = "employee")
	public JAXBElement<Employee> createEmployee(Employee value) {
		return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
	}

}
