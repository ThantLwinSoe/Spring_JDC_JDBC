package com.jdc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.jdc.app.db.generate")
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource get_Driver_Manager_Data_Source() {
		var data_source = new DriverManagerDataSource();
		data_source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data_source.setUrl("jdbc:mysql://localhost:3306/PrepareStatement");
		data_source.setUsername("root");
		data_source.setPassword("ThantLwinSoe@123");
		return data_source;
	}
	
	@Bean
	public JdbcTemplate get_JDBC_Template() {
		var template = new JdbcTemplate();
		template.setDataSource(get_Driver_Manager_Data_Source());
		return template;
	}
	
}
