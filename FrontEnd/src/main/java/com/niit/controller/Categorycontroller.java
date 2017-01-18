package com.niit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Model.Category;
import com.niit.dao.CategoryDao;
import com.niit.dao.CategoryDaoImpl;

@Controller
public class Categorycontroller {
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView categoryPage() {
		CategoryDao categoryDao = new CategoryDaoImpl();
		ModelAndView model = new ModelAndView("category", "categoryModel", new Category());
		model.addObject("list", categoryDao.getCategory());

			return model;
	}

	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public String addCategory(Category categoryModel) {
		CategoryDao categoryDAO = new CategoryDaoImpl();
		categoryDAO.addCategory(categoryModel);
		return "redirect:/category";
	}
	// ---------------------------------delete---------------------------------
	@RequestMapping(value = "/deletecategory", method = RequestMethod.GET)
	public String deletecategory(@RequestParam("categoryId") String categoryId) {
		CategoryDao categoryDao = new CategoryDaoImpl();

		categoryDao.deleteCategory(categoryId);
		return "redirect:/category";

	}
	@RequestMapping(value = "/editcategory", method = RequestMethod.GET)
	public ModelAndView editCategory(@RequestParam("categoryId") String categoryId) {
		CategoryDao categoryDAO = new CategoryDaoImpl();
		ModelAndView model = new ModelAndView("category", "categoryModel", new Category());

		model.addObject("list", categoryDAO.getCategory());

		// model.addObject("values", categoryDAO.getById(categoryId));

		return model;
	}




}
