package com.niit.dao;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.niit.Model.User;

public class UserDaoImpl implements UserDao{

	public boolean validationLogin(String username, String password) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		boolean userFound = false;

		String sqlQuery = " from User as o where o.username=? and o.password=?";
		Query query = session.createQuery(sqlQuery);
		query.setParameter(0, username);
		query.setParameter(1, password);
		List<?> list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		return userFound;              
	}

	
	public boolean validationRegistration(User userObj) {

		userObj.setUsername(userObj.getUsername());
		userObj.setEmail(userObj.getEmail());
		userObj.setBirthday(userObj.getBirthday());
		userObj.setPassword(userObj.getPassword());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(userObj);
		User user = (User) session.get(User.class, userObj.getUsername());

		session.getTransaction().commit();
		session.close();
	
		return true;
	}
	
	
	
}
