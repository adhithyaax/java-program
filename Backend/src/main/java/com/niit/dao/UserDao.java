package com.niit.dao;

import com.niit.Model.User;

public interface UserDao {
boolean validationLogin(String username, String password);
public boolean validationRegistration(User userObj);

}
