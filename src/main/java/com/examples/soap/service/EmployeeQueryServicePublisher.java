/**
 * Copyright NEWFOUND SYSTEMS to Present
 * All Rights Reserved
 */
/**
 * 
 */
package com.examples.soap.service;

import javax.xml.ws.Endpoint;

public class EmployeeQueryServicePublisher {
	public static void main(String[] args) {
		System.out.println("Employee Query Service has been published, waiting for client request...");
		Endpoint.publish("http://localhost:9999/ws/EmployeeQuery", new EmployeeQueryImpl());
	}
}
