package com.jdc.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.app.db.generate.EmployeeService;
import com.jdc.app.dto.Employee;

@SpringJUnitConfig(locations = "classpath:/app-context.xml")
public class TestResultSetExtractor {
	
	@Autowired
	private EmployeeService service;
	
	@Test
	public void Test() {
		List<Employee> list = service.get_All_Employee();
		
		for(Employee e : list) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getAddress());
		}
	}
}
