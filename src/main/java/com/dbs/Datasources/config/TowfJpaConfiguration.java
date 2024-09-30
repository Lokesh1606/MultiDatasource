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
        basePackages = "com.dbs.Datasources.towf.repo",
        entityManagerFactoryRef = "towfEntityManager",
        transactionManagerRef = "towfTransacationManager"
)
public class TowfJpaConfiguration {
    @Bean
    public LocalContainerEntityManagerFactoryBean towfEntityManager(@Autowired EntityManagerFactoryBuilder entityManagerFactoryBuilder,
                                                             @Qualifier("towfDataSource") DataSource dataSource){
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.dbs.Datasources.towf.entity")
                .build();
    }
    @Bean
    PlatformTransactionManager towfTransacationManager(@Qualifier("towfEntityManager") LocalContainerEntityManagerFactoryBean emfb){
        return new JpaTransactionManager(emfb.getObject());
    }

}
