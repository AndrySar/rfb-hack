package ru.rfb.hack.configuration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class LiquibaseConfiguration {

//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SpringLiquibase liquibase() {
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setChangeLog("classpath:liquibase-changelog.xml");
//        liquibase.setDataSource(dataSource);
//        return liquibase;
//    }
}
