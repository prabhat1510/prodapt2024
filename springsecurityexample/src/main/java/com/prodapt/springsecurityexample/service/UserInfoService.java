package com.prodapt.springsecurityexample.service;

import com.prodapt.springsecurityexample.entities.UserInfo;
import com.prodapt.springsecurityexample.exceptions.UserNotFoundException;

public interface UserInfoService {

	public UserInfo createUser(UserInfo user);
	public UserInfo getUserByUserName(String userName) throws UserNotFoundException;
}
