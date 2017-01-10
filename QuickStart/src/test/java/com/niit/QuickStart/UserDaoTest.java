package com.niit.QuickStart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.quickstart.dao.UserDao;
import com.niit.quickstart.model.User;

import junit.framework.Assert;

public class UserDaoTest {

	@Autowired
	static UserDao userDao;
	
	@Autowired
	static User user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init()
	{
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	user = (User) context.getBean("user");
	userDao = (UserDao) context.getBean("userDaoImpl");
	}
	
	@Test
	public void getUserTestCase()
	{
		user = userDao.get("hi");
		//assert statements
		System.out.println("getUsertestcase executing");
		Assert.assertNotNull("getUserTestcase", user);
	}
	
	@Test
	public void validateCredentials()
	{
		user= userDao.validate("hi", "going");
		Assert.assertEquals("validate",null, user);
		

	}
	@Test
	public void getAllusertestcase()
	{
		int size = userDao.list().size();
		Assert.assertEquals("length",8, size);
	}
	
	@Test
	public void saveTestcase()
	{
		//you have to create new row in db		//provide values for user
		user.setStudentid("ram");
		user.setUsername("ram");
		user.setPassword("ram123");
		user.setBirthdate("654789123");
		user.setEmail("Ram@gmail.com");
		
		Assert.assertEquals("save", true, userDao.saveOrUpdate(user));
	}
	@Test
	public void updateTestCase()
	{   //it will update the mentioned one
		user=userDao.get("ram");//before updating first get the data 
		user.setUsername("ram");//updating the method
		user.setPassword("password");
		
		Assert.assertEquals("update", true, userDao.saveOrUpdate(user));
	}
	
	
	}

