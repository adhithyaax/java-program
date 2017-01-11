package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Model.User;
import com.niit.dao.UserDao;
import com.niit.dao.UserDaoImpl;

@Controller
public class HomeController {

	
	@RequestMapping("/login")
	public String hello(){
		return "login";
	}

	@RequestMapping("/about")
	public String hello2(){
		return "about";
	}

	@RequestMapping("/registration")
	public String hello3(){
		return "registration";
	}
	
	@RequestMapping(value="/loginsuccess", method=RequestMethod.POST)
	public ModelAndView hello4(@RequestParam("username") String username, @RequestParam("password") String password){
		UserDao userDao= new UserDaoImpl();
		
		if(userDao.validationLogin(username, password)){
		ModelAndView model= new ModelAndView("loginsuccess");
		 return model;}
		else{ModelAndView model= new ModelAndView("login"); 
			return model;}
	}
	
@RequestMapping(value = "/registrationsuccess", method = RequestMethod.POST)
		public ModelAndView hello( @ModelAttribute("obj") User user) {
			UserDao userDao = new UserDaoImpl();

			if (userDao.validationRegistration(user)) {
			ModelAndView model = new ModelAndView("registrationsuccess");

				return model;
			} else {
				ModelAndView model = new ModelAndView("registration");
				return model;

			}
		}

	}
	

