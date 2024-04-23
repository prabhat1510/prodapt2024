package logintestproject.dao;

import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;

public interface LoginDAO {
	public Login getLoginDetails(String userName) throws UserNameNotFoundException;
}