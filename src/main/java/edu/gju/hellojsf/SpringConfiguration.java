package edu.gju.hellojsf;

import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hesham
 */
@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableJpaRepositories
public class SpringConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
        jpaProperties.put("hibernate.show_sql", "true");
        entityManagerFactory.setJpaProperties(jpaProperties);
        entityManagerFactory.setPackagesToScan("edu.gju.hellojsf.entities");
        entityManagerFactory.setPersistenceProvider(new HibernatePersistenceProvider());
        return entityManagerFactory;
    }

    @Bean
    public JpaTransactionManager transactionManager(DataSource dataSource, EntityManagerFactory entityManager) {

        JpaTransactionManager transactionManager = new JpaTransactionManager(entityManager);
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql:/" + "/localhost:3306/testJSF");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;

    }

}
