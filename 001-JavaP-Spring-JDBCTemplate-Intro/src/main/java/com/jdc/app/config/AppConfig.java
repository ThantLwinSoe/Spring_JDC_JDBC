package com.jdc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.jdc.app.model"})
public class AppConfig {
	

	@Bean
	public DriverManagerDataSource get_Driver_Manager_Data_Source() {
		var dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/JdbcTemplateIntro");
		dataSource.setUsername("root");
		dataSource.setPassword("yourcustompassword");		
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {		
		return new JdbcTemplate(get_Driver_Manager_Data_Source());
		
		
	}
	
}
