package com.dbs.Datasources.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class TowfConfiguration {
    @ConfigurationProperties("spring.datasource.towf")
    @Bean
    DataSourceProperties towfDataSourceProperties(){
        return new DataSourceProperties();
    }
    @Primary
    @Bean(name = "towfDataSource")
    public DataSource towfDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername(towfDataSourceProperties().getUsername());
        dataSource.setPassword(towfDataSourceProperties().getPassword());
        dataSource.setUrl(towfDataSourceProperties().getUrl());
        dataSource.setDriverClassName(towfDataSourceProperties().getDriverClassName());
        return dataSource;
    }

}
