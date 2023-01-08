package com.rahul.user_management.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.user_management.entity.State;
@Repository
public interface StateRepo extends JpaRepository<State, Serializable>{
	
	//Select * from State_Master where countryid=?
public List<State> findBycountryid(Integer countryid);









}
