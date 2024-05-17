package com.prodapt.springsecurityexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.springsecurityexample.entities.UserInfo;
import com.prodapt.springsecurityexample.exceptions.UserNotFoundException;
import com.prodapt.springsecurityexample.repositories.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository repo;
	@Override
	public UserInfo createUser(UserInfo user) {
		return repo.save(user);
	}

	@Override
	public UserInfo getUserByUserName(String userName) throws UserNotFoundException{
		return repo.findByUserName(userName);
	}

}
