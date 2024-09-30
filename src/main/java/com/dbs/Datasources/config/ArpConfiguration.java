package com.dbs.Datasources.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ArpConfiguration {
    @ConfigurationProperties("spring.datasource.arp")
    @Bean
    DataSourceProperties arpDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean(name = "arpDataSource")
    public DataSource arpDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername(arpDataSourceProperties().getUsername());
        dataSource.setPassword(arpDataSourceProperties().getPassword());
        dataSource.setUrl(arpDataSourceProperties().getUrl());
        dataSource.setDriverClassName(arpDataSourceProperties().getDriverClassName());
        return dataSource;
    }

}
