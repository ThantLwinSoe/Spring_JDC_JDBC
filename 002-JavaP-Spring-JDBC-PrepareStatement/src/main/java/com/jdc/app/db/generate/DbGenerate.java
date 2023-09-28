package com.jdc.app.db.generate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;

import com.jdc.app.dto.Employee;

@Service
public class DbGenerate {
	
	@Autowired
	private JdbcTemplate template;
	
	public Boolean saveEmployee(Employee e) {
		
		var query = "insert into Employee values (?,?,?)";
		
	 return	template.execute(query, (PreparedStatementCallback<Boolean>) (ps) -> {
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getAddress());
			
			return ps.execute(); // Don't forget this method when u have done prepareStatement
		});	
	}

}
