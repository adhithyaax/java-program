package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.Model.Category;
import com.niit.Model.Supplier;

@Service
public interface SupplierDao {
	public boolean addSupplier(Supplier c);

	public void editSupplier(Supplier c);

	public boolean deleteSupplier(String id);

	public List<Supplier> getSupplier();

	public Supplier showSupplier(String id);


}
