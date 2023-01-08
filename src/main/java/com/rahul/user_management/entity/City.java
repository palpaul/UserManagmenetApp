package com.rahul.user_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "City_Master")
public class City {

	@Id
	private Integer cityid;
	private String cityname;
	private Integer stateid;
}
