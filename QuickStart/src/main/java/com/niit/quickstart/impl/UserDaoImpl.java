package com.niit.quickstart.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.quickstart.dao.*;
import com.niit.quickstart.model.*;
@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	  @Autowired
	    private SessionFactory sessionFactory;
	 
	    public UserDaoImpl() {
	         
	    }
	     
	    public UserDaoImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	 
	    
	    
	    @Transactional
	public List<User> list() {
	    	 @SuppressWarnings("unchecked")
	         List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
	                 .createCriteria(User.class)
	                 .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

	    
		@Transactional
		public boolean saveOrUpdate(User user) {
			try {
				sessionFactory.getCurrentSession().saveOrUpdate(user);
			} catch (Exception e) {
			e.printStackTrace();
			return false;
			}
			return true;
		}
	 
	    	 
	    @Transactional
	    public User get(int id) {
	        String hql = "from User where id=" + id;
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	         
	        @SuppressWarnings("unchecked")
	        List<User> listUser = (List<User>) ((Criteria) query).list();
	         
	        if (listUser != null && !listUser.isEmpty()) {
	            return listUser.get(0);
	        }
	         
	        return null;
	}
	
	    @Transactional
	    public User validate(String studentid , String password ){
	    	String hql ="from User where id='"+studentid+"'   and password='"+password+"'";
	    Query query=sessionFactory.getCurrentSession().createQuery(hql);
	    return (User)query.uniqueResult();
	    
	    
	    }
	    
	    
	    
	    
	    public boolean validation(User userObj) {
		// TODO Auto-generated method stub
		userObj.setUsername(userObj.getUsername());
		userObj.setStudentid(userObj.getStudentid());
		userObj.setPassword(userObj.getPassword());
		userObj.setEmail(userObj.getEmail());
		userObj.setBirthdate(userObj.getBirthdate());

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(userObj);
		User user = (User) session.get(User.class, userObj.getUsername());

		
		System.out.println(user.getEmail());
		
		session.getTransaction().commit();
		session.close();		
		return true;
	}

	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
public void addUser(User userdet) {
		
		
		UserCredentials uc=new UserCredentials();
		
		uc.setUsername(userdet.getUsername());
		uc.setPassword(userdet.getPassword());
		
		System.out.println("usercredential");
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
	//	tx.begin();
		session.save(userdet);
		session.save(uc);
		//tx.commit();
		session.flush();
		session.close();
	}
public UserCredentials getInfo(String un)
{
	
	Session session=sessionFactory.openSession();
	Transaction tx=session.getTransaction();
	tx.begin();
	UserCredentials credobj=(UserCredentials)session.get(UserCredentials.class, un);
	System.out.println(credobj.getUsername());
	tx.commit();
	return credobj;
}

public boolean validationLogin(String studentid, String password) {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	boolean userFound = false;
	
	String sqlQuery = " from UserModel as o where o.userName=? and o.password=?";
	Query query = session.createQuery(sqlQuery);
	query.setParameter(0,studentid);
	query.setParameter(1, password);
	List list = query.list();

	if ((list != null) && (list.size() > 0)) {
		userFound= true;
	}

	session.close();
	return userFound;              

	
}




}

		
	


	


