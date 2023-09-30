package com.jdc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jdc.app.db.generate")
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource get_Driver_Manager_Data_Source() {
		var data_source = new DriverManagerDataSource(
				"jdbc:mysql://localhost:3306/PrepareStatement", 
				"root", 
				"ThantLwinSoe@123");
		data_source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		
		return data_source;
	}
	
	@Bean
	public JdbcTemplate get_Jdbc_Template() {
		
		return new JdbcTemplate(get_Driver_Manager_Data_Source());
	}
}
