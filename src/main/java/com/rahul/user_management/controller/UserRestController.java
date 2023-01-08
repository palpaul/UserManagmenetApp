package com.rahul.user_management.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.user_management.binding.LoginForm;
import com.rahul.user_management.binding.UnlockAccountForm;
import com.rahul.user_management.binding.UserForm;
import com.rahul.user_management.services.UserMgmtService;
import com.rahul.user_management.servicesImpl.UserManagementServiceImpl;

@RestController
public class UserRestController {
	
	@Autowired
	private UserManagementServiceImpl userManagementServiceImpl;

	@GetMapping("/about")
	public String about() {
		return "Hey welcome to user management application...!!";
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody LoginForm loginForm) {
		 String status = userManagementServiceImpl.login(loginForm);
		 return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/countries")
	public Map<Integer, String> loadCountries(){
		return userManagementServiceImpl.getCountries();
	}
	
	@GetMapping("/states/{countryId}")
 public Map<Integer, String> loadStatse(@PathVariable Integer countryId){
		return userManagementServiceImpl.getStates(countryId);
	}
	
	@GetMapping("/cities/{stateId}")
	public Map<Integer, String> loadCities(@PathVariable Integer stateId){
		return userManagementServiceImpl.getCities(stateId);
	}
	
	@GetMapping("/email/{email}")
	public String EmailCheck(@PathVariable String email) {
		return userManagementServiceImpl.checkEmail(email);
		
	}
	
	@PostMapping("/usereg")
	public ResponseEntity<String> UserRegistration(@RequestBody UserForm userForm) {
		 String status = userManagementServiceImpl.registerUser(userForm);
		 return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/unlock")
	public ResponseEntity<String> unlockAccount(@RequestBody UnlockAccountForm uccAcc){
		String status = userManagementServiceImpl.unlockAccount(uccAcc);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/forget/{email}")
	public ResponseEntity<String> forgetPwd(@PathVariable String email){
		String status = userManagementServiceImpl.forgetPass(email);
		return new ResponseEntity<>(status,HttpStatus.OK);

	}
	
	
}
