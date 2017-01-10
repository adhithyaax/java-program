package com.niit.quickstart.config;


import java.util.Properties;
import java.util.function.Supplier;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.niit.quickstart.dao.UserDao;
import com.niit.quickstart.impl.UserDaoImpl;
import com.niit.quickstart.model.User;

@Configuration
@ComponentScan("com.niit.quickstart")
@EnableTransactionManagement
public class ApplicationContextConfig {
 
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:~/test");
	dataSource.setUsername("adhithya");
	dataSource.setPassword("9500738227");
	return dataSource;
	}
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto","update");
		return properties;
		}
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.addProperties(getHibernateProperties());

	sessionBuilder.addAnnotatedClasses(User.class);
	return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	sessionFactory);
	
	return transactionManager;}
	@Autowired
	@Bean(name = "userDao")
	public UserDao getUserDao(SessionFactory sessionFactory) {
	return new UserDaoImpl();
	
	}
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
		
	
	}}
