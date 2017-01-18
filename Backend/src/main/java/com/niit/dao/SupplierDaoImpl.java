package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.Model.Category;
import com.niit.Model.Supplier;

public class SupplierDaoImpl implements SupplierDao{

	public boolean addSupplier(Supplier c) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(c);

		session.getTransaction().commit();
		session.close();

		return true;

	}

	public void editSupplier(Supplier c) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteSupplier(String id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Supplier supplierModel = new Supplier();
		supplierModel.setSupplierID(id);

		session.delete(supplierModel);
		session.getTransaction().commit();
		session.close();

		return true;

	}
	@SuppressWarnings("unchecked")
	public List<Supplier> getSupplier() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Supplier> list = (List<Supplier>) session.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;


	}

	public Supplier showSupplier(String id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		return (Supplier)session.get(Supplier.class, id);

	}

	}
