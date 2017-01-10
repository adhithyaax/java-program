package com.niit.quickstart.dao;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.quickstart.model.User;
import com.niit.quickstart.model.*;
@Service
public interface UserDao {
	
	public List<User> list();
	public User get(String id);
	public User validate(String studentid,String password);
	public boolean saveOrUpdate(User user);
	public void addUser(User userdet);
	
	public boolean validation(User user);
	void delete(int id);
	public boolean validationLogin(String studentid, String password);
}
