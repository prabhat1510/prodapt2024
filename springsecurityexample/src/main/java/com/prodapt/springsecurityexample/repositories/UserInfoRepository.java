package com.prodapt.springsecurityexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.springsecurityexample.entities.UserInfo;
import com.prodapt.springsecurityexample.exceptions.UserNotFoundException;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {
	public UserInfo findByUserName(String userName) throws UserNotFoundException;
}
