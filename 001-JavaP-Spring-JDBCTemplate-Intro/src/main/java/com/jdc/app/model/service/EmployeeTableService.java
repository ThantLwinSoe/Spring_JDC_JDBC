package com.jdc.app.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jdc.app.model.dto.Employee;

@Service
public class EmployeeTableService {
	
	@Autowired
	private JdbcTemplate template;

	
	public int saveEmployee(Employee e) {
		
		var query = "insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		
		return template.update(query);
	}
}
