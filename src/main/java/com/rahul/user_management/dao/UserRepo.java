package com.rahul.user_management.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.user_management.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Serializable>{
	
	//select * from user_master where email = ?
	public User findByEmail(String email);
	
	//select * from User_Master where email=? and user_pwd =?
	public User findByEmailAndUserPwd(String email,String pwd);

}
