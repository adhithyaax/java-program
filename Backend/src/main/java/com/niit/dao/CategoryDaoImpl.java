package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.Model.Category;

public class CategoryDaoImpl implements CategoryDao {

	public boolean addCategory(Category c) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(c);

		session.getTransaction().commit();
		session.close();

		return true;

		
	}

	public void editCategory(Category c) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteCategory(String id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Category categoryModel = new Category();
		categoryModel.setCatID(id);

		session.delete(categoryModel);
		session.getTransaction().commit();
		session.close();

		return true;

		
	}

	@SuppressWarnings("unchecked")
	public List<Category> getCategory() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Category> list = (List<Category>) session.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

	}

	public Category showCategory(int id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		return (Category)session.get(Category.class, id);
	}

	public Category showCategory(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	}


