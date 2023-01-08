package com.rahul.user_management.binding;

import lombok.Data;

//binding class is used to represent the data
	//entity class is mapped with database okay so both entity and binding class are different .
	
@Data
public class UnlockAccountForm {

	private String email;
	private String tempPwd;
	private String newPwd;
	private String confirmPwd;
	
}
