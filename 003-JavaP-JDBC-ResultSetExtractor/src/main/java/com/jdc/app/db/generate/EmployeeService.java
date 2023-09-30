package com.jdc.app.db.generate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.jdc.app.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private JdbcTemplate template;
	
	private List<Employee> list;
	
	public EmployeeService() {
		this.list = new ArrayList<Employee>();
	}
		
	
	public List<Employee> get_All_Employee() {
		
		var str = "select * from Employee";
		
		return template.query(str ,(ResultSetExtractor<List<Employee>>) (rs) -> {
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAddress(rs.getString(3));
				list.add(emp);		
			} 
			return list;
			
		}) ;
	}

}
