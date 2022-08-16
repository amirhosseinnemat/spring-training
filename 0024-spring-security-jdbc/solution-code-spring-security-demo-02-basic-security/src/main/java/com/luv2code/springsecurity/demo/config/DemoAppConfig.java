package com.luv2code.springsecurity.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Logger;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.luv2code.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {


    // set-up variable to hold the properties
    @Autowired
    private Environment environment;

    // set-up a logger for diagnostics
    private Logger logger = Logger.getLogger(getClass().getName());

    // define a bean for ViewResolver

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    // define a bean for our security datasource
    @Bean
    public DataSource securityDataSource() {

        // create connection pool
        ComboPooledDataSource securityDatasource = new ComboPooledDataSource();

        // set the jdbc driver class
        try {
            securityDatasource.setDriverClass(environment.getProperty("jdbc.driver"));
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

        // log the connection props
        // just make sure reading data from properties file
        logger.info(">>> jdbc.url=" + environment.getProperty("jdbc.url"));
        logger.info(">>>jdbc.user=" + environment.getProperty("jdbc.user"));

        // set database connection props
        securityDatasource.setJdbcUrl(environment.getProperty("jdbc.url"));
        securityDatasource.setUser(environment.getProperty("jdbc.user"));
        securityDatasource.setPassword(environment.getProperty("jdbc.password"));

        // set connection pool props
        // data value in properties file are just String, so for convert it to integer we use
        // helper method getIntProperty
        securityDatasource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
        securityDatasource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
        securityDatasource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
        securityDatasource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
        return securityDatasource;
    }

    // need a helper method
    // read environment property and convert it to int
    private int getIntProperty(String propName) {
        String propVal = environment.getProperty(propName);

        // now convert to int
        int intPropVal = Integer.parseInt(propVal);
        return intPropVal;
    }

}









