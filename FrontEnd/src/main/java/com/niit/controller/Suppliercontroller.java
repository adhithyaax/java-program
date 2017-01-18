package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Model.Category;
import com.niit.Model.Supplier;
import com.niit.dao.CategoryDao;
import com.niit.dao.CategoryDaoImpl;
import com.niit.dao.SupplierDao;
import com.niit.dao.SupplierDaoImpl;

@Controller
public class Suppliercontroller {
	@RequestMapping(value = "/supplier", method = RequestMethod.GET)
	public ModelAndView supplierPage() {
		SupplierDao supplierDao = new SupplierDaoImpl();
		ModelAndView model = new ModelAndView("supplier", "supplierModel", new Supplier());
		model.addObject("list", supplierDao.getSupplier());

			return model;


}
	@RequestMapping(value = "/addsupplier", method = RequestMethod.GET)
	public String addSupplier(Supplier supplierModel) {
		SupplierDao supplierDao = new SupplierDaoImpl();
		supplierDao.addSupplier(supplierModel);
		return "redirect:/supplier";
	}	
}
