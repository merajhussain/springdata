package com.meraj.demo.config;

import javax.activation.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbSource {
	
	@Bean
    public javax.sql.DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSourceBuilder.url("jdbc:microsoft:sqlserver://localhost:1433;databasename=person");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("Opentext1!");
        
        
        return dataSourceBuilder.build();
    }

}
