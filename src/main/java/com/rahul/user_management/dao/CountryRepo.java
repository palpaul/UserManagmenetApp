package com.rahul.user_management.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.user_management.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Serializable>{

}
