package com.alab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.alab.dao", "com.alab.service" })
public class ServiceConfig {

	/*@Bean
	public DataSource createDataSourse() {
		System.out.println("datasource");
		HikariDataSource ds = null;
		ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("system");
		return ds;
	}*/

}
