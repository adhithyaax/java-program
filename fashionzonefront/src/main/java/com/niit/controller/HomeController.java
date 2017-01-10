package com.niit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.quickstart.dao.UserDao;
import com.niit.quickstart.impl.UserDaoImpl;
import com.niit.quickstart.model.User;
import com.niit.shopping.dao.UserLoginDao;
import com.niit.shopping.dao.UserLoginDaoImpl;

@Controller
public class HomeController {

	@RequestMapping("/aboutus")
	public String showAboutUs()
	{
		return "aboutus";
	}
	
	@RequestMapping("/registration")
	public String showregistration()
	{
		return "registration";
	}
	@RequestMapping("/success")
	public String success()
	{
		return "success";
	}

	@RequestMapping("/login")
	public String showlogin()
	{
		return "login";
	}


	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView hello(@Valid @ModelAttribute("obj") User user, BindingResult resultobj) {

		// for just practicing errorResult
		UserDao userDao = new UserDaoImpl();
		if (resultobj.hasErrors()) {
			ModelAndView model1 = new ModelAndView("register");
			return model1;
		}
	

		if (userDao.validation(user)) {
		ModelAndView model = new ModelAndView("success");

			return model;
		} else {
			ModelAndView model = new ModelAndView("login");
			return model;

		}
	}

	// for just practicing addAttribute reusability of code
	public void hello1(Model obj2) {
		obj2.addAttribute("msg", "Your are successfully registered,   Rock on ");
	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView hello4(@RequestParam("studentid") String studentid, @RequestParam("password") String password) {
		UserDao obj = new UserDaoImpl();
		
		  if (obj.validationLogin(studentid,password)) {
		  ModelAndView model = new ModelAndView("loginsuccess");
			model.addObject("studentid", studentid);
			return model;
		}
		/*
		 * ModelAndView model1 = new ModelAndView("login");
		 * model1.addObject("result",
		 * "Check your username or password, Try again buddy"); return model1; }
		 */
		ModelAndView model = new ModelAndView("login");
		model.addObject("studentid", studentid);
		return model;

	}
}


}
