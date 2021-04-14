package com.demo.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.login.Model.Login;
import com.demo.login.Repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepo;
	
	@Override
	public Login save(Login login) {
		loginRepo.save(login);
		return login;
	}

}
