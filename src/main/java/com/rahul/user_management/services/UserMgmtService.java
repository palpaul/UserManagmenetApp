package com.rahul.user_management.services;

import java.util.Map;
import com.rahul.user_management.binding.LoginForm;
import com.rahul.user_management.binding.UnlockAccountForm;
import com.rahul.user_management.binding.UserForm;

public interface UserMgmtService {
	
	//public String login(Login login);
	//check email should be unique so one method is required for that
	public String checkEmail(String email);
	
	//state is depends on country so I need country data in the form of key ,value pair
	// get all countries form the drop down okay so its not taking any parameter in the method
	public Map<Integer, String> getCountries();
	
	//state is depends on country so its required one parameter countryId
	public Map<Integer, String> getStates(Integer countryId);

	//cities is depends on state so its required one parameter stateId
	public Map<Integer, String> getCities(Integer stateId);
	
	/*when user click on submit need to store the records so we need one method okay
	we are taking User object in the method parameter okay to save the records
	whatever the data user fill up in the form  that form data will come in the object format
	that object we need to store in the db */
	//registerUser() method save the records and also responsible for send the email to unlock the account also ok
	public String registerUser(UserForm user);
	
	//unlock the account 
	public String unlockAccount(UnlockAccountForm unlAccForm);	
	
	//login
	public String login(LoginForm loginForm);
	
	//forgetPass
	public String forgetPass(String email);
	
	//logout
	public String logout(int id);
	
	

}

