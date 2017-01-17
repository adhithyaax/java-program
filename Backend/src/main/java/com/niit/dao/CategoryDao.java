package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.Model.Category;

@Service
public interface CategoryDao {
	public boolean addCategory(Category c);

	public void editCategory(Category c);

	public boolean deleteCategory(String id);

	public List<Category> getCategory();

	public Category showCategory(String id);



}
