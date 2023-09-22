package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.app.model.dto.Employee;
import com.jdc.app.model.service.EmployeeTableService;

@SpringJUnitConfig(locations = {"classpath:/app-context.xml"})
public class Testing {
	
	@Autowired
	private EmployeeTableService service;
	
	@Test
	public void testOk() {
	 var num = service.saveEmployee(new Employee(2, "Thet Hmue", 1000000));
	 System.out.println(num);
	}
}
