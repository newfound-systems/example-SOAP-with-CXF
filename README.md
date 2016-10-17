# Example JAX-WS SOAP with CXF
Example of using JAX-WS SOAP with Apache CXF

## Getting Started

### Prerequisities
* Basic understanding of Web Services
* Understanding of JSON or XML.

### Technologies
* JDK 1.7 and above
* Maven 3+
* JAXB

## Running service publisher
* com.examples.soap.service.EmployeeQueryServicePublisher

## Generate Client Code from Published WSDL
* wsimport -s . -Xnocompile http://localhost:9999/ws/EmployeeQuery?wsdl

## Running SOAP Client
* com.examples.soap.client.EmployeeQuerySoapClient

### SOAP Response
Response (Single Employee): Employee [fullName=Chetan, location=Bangalore, id=1]

--- Writing xml to String...
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<Employee id="1">
    <FullName>Chetan</FullName>
    <Location>Bangalore</Location>
</Employee>

Response (All Employees): Employee [fullName=Chetan, location=Bangalore, id=1]
Response (All Employees): Employee [fullName=Amit, location=Singapore, id=2]
Response (All Employees): Employee [fullName=Akhil, location=Phoenix, id=3]

--- Writing xml to String...
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<Employees>
    <Employee id="1">
        <FullName>Chetan</FullName>
        <Location>Bangalore</Location>
    </Employee>
    <Employee id="2">
        <FullName>Amit</FullName>
        <Location>Singapore</Location>
    </Employee>
    <Employee id="3">
        <FullName>Akhil</FullName>
        <Location>Phoenix</Location>
    </Employee>
</Employees>

## Versioning
We use [Apache Subversion (https://subversion.apache.org/)] for versioning. 

## Authors
* **Chetan Anand** - *Developer* - [NEWFOUND SYSTEMS http://www.newfound-systems.com]

## License
This project is licensed under the Open Free for all License.

