package com.rahul.user_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Country_Master")
public class Country {

	@Id
	private Integer countryid;
	private String countryname;
	
}
