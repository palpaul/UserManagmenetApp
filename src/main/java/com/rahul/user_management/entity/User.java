package com.rahul.user_management.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="User_Master")
public class User {
	
	
	@Id
	@GeneratedValue
	Integer userid;
	private String fname;
	private String lname;
	private String email;
	private Long phno;
	private LocalDate dob;
	private String gender;
	private Integer countryid;
	private Integer stateid;
	private Integer cityid;
	private String userPwd;
	private String accstatus;
	
	
	
	
	

}
