package com.jdc.test.preparestatement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.app.db.generate.DbGenerate;
import com.jdc.app.dto.Employee;

@SpringJUnitConfig(locations = {"classpath:/app-context.xml"})
public class AppTest {
	
	@Autowired
	private DbGenerate generate;
	
	@Test
	public void test_Preparement_Statement() {
		
		generate.saveEmployee(new Employee(1, "Aung Myin", "Yangon"));
		generate.saveEmployee(new Employee(2, "Thet", "Dawei"));
		generate.saveEmployee(new Employee(3, "Di Di", "Myeik"));
		generate.saveEmployee(new Employee(4, "Thant", "New York"));
		
		
	}
	
}
