package logintestproject.service;

import logintestproject.exceptions.PasswordMismatchException;
import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;

public interface LoginService {
	public String verifyUserNameAndPassword(Login login) throws UserNameNotFoundException,PasswordMismatchException;
}
