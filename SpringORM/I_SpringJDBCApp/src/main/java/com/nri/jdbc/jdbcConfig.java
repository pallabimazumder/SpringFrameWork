package com.nri.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
// Makes this config file can be used as xml file
@ComponentScan(basePackages = "com.nri")
//Base package from which all operations will work so search can be faster
public class jdbcConfig {

	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/hibernatedb?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("oracle");
		return ds;
	}
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
