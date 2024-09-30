package com.dbs.Datasources.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.dbs.Datasources.arp.repo",
        entityManagerFactoryRef = "arpEntityManager",
        transactionManagerRef = "arpTransacationManager"
)
public class ArpJpaConfiguration {
    @Bean
    public LocalContainerEntityManagerFactoryBean arpEntityManager(@Autowired EntityManagerFactoryBuilder entityManagerFactoryBuilder,
                                                             @Qualifier("arpDataSource") DataSource dataSource){
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.dbs.Datasources.arp.entity")
                .build();
    }


    @Bean
    PlatformTransactionManager arpTransacationManager(@Qualifier("arpEntityManager") LocalContainerEntityManagerFactoryBean emfb){
        return new JpaTransactionManager(emfb.getObject());
    }
}
