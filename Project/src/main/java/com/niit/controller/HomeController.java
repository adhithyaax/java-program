package com.niit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.quickstart.model.User;
import com.niit.quickstart.dao.UserDao;
import com.niit.quickstart.impl.UserDaoImpl;


@Controller
public class HomeController {
@Autowired
UserDao userDao;
	@RequestMapping("/about")
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

	


@RequestMapping("/validate")
public ModelAndView validate(@RequestParam("studentid")String studentid,
         @RequestParam("password") String password)
{
System.out.println("In validate method");
System.out.println("studentid" +studentid);
System.out.println("password" +password);
ModelAndView mv=new ModelAndView("login");
if(userDao.validate(studentid,password)!=null)
{
	mv.addObject("successmsg","you logged in successfully");
}
else
{
	mv.addObject("errormsg","Invalid Credentials...Please try again");
}
return mv;
	
}

}
