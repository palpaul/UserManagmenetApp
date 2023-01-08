package com.rahul.user_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "State_Master")
public class State {

	@Id
	private Integer stateid;
	private String statename;
	private Integer countryid;
	
}