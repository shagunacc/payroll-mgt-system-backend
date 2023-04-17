package com.learningapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningapp.model.User;
import com.learningapp.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginRepository loginrepo;

	@Override
	public boolean login(String username, String password) {
		List<User> userList = loginrepo.findAll(); //take complete list of data
		for(User us:userList) {
			if(us.getUsername().equals(username) && us.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
		}
	

}
