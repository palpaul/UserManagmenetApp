package com.rahul.user_management.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.rahul.user_management.entity.City;
@EnableJpaRepositories
public interface CityRepo extends JpaRepository<City, Serializable>{

	//Select * from City_Master where stateid=?
public List<City> findBystateid(Integer stateid);

}
