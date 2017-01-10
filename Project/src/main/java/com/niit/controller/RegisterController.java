package com.niit.controller;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
 
import com.niit.quickstart.model.*;
import com.niit.quickstart.dao.UserDao;
import com.niit.quickstart.impl.UserDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class RegisterController {
	
	
 /*   @RequestMapping(value="/RegistrationSuccess" ,method = RequestMethod.GET)
    public ModelAndView submitRegisterForm(@ModelAttribute("user") User user) {
    	System.out.println("welcome in register page");
			ModelAndView model1 = new ModelAndView("RegistrationSuccess");
			return model1;
		}
	
/*
    @RequestMapping(value = "RegistrationSuccess", method = RequestMethod.POST)
	public ModelAndView success(User ud, Model m) {
UserDao userDaoImpl=new UserDaoImpl();
		System.out.println("post method of register");
		userDaoImpl.addUser(ud);

		ModelAndView model = new ModelAndView("RegistrationSuccess", "user", new User());
		return model;

	}
*/
	/*@RequestMapping(value = "/RegistrationSuccess", method = RequestMethod.POST)
	public ModelAndView hello(@Valid @ModelAttribute("obj") User userModel, BindingResult resultobj) {

		// for just practicing errorResult
		UserDao userDao = new UserDaoImpl();
		if (resultobj.hasErrors()) {
			ModelAndView model1 = new ModelAndView("registration");
			return model1;
		}
	

		if (userDao.validation(userModel)) {
		ModelAndView model = new ModelAndView("RegistrationSuccess");

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


*/
	
	
}
