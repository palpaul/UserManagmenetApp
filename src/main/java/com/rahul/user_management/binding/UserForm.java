package com.rahul.user_management.binding;

import java.time.LocalDate;
import lombok.Data;

//binding class is used to represent the data
//entity class is mapped with database okay so both entity and binding class are different .

@Data
public class UserForm {
	
	private String fname;
	private String lname;
	private String email;
	private Long phno;
	private LocalDate dob;
	private String gender;
	private Integer countryid;
	private Integer stateid;
	private Integer cityid;
	
}
