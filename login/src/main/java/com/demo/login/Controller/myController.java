package com.demo.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.Model.Login;
import com.demo.login.Service.LoginServiceImpl;

@RestController
@RequestMapping("/api")
public class myController {
	
	@Autowired 
	LoginServiceImpl loginService;
	
	
	@PostMapping("/save")
		public ResponseEntity<Login> save(@RequestBody Login login){
			Login l = loginService.save(login);
			return new ResponseEntity<Login>(l,HttpStatus.OK);
		}
	}

