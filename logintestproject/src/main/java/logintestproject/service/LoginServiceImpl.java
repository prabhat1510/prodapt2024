package logintestproject.service;

import logintestproject.dao.LoginDAO;
import logintestproject.dao.LoginDAOImpl;
import logintestproject.exceptions.PasswordMismatchException;
import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;

public class LoginServiceImpl implements LoginService {

	@Override
	public String verifyUserNameAndPassword(Login login) throws UserNameNotFoundException, PasswordMismatchException {
		LoginDAO loginDAO = new LoginDAOImpl();
		Boolean isVerified = false;

		Login loginDetailsFromDB = loginDAO.getLoginDetails(login.getUserName());
		if (loginDetailsFromDB != null) {
			isVerified = matchUserNameAndPassword(login, loginDetailsFromDB);
		}

		if (isVerified) {
			return "Username and Password verified successfully";
		} else {
			throw new PasswordMismatchException(
					"Password for username " + login.getUserName() + "doesn't match with our record");
		}
	}

	private Boolean matchUserNameAndPassword(Login login, Login loginDetailsFromDB) {
		if (login.getPassword().equals(loginDetailsFromDB.getPassword())) {
			return true;
		}
		return false;
	}

}
