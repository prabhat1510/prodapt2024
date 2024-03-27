package layeredarchitectureexample.service;

import layeredarchitectureexample.dao.LoginDAO;
import layeredarchitectureexample.dao.LoginDAOImpl;
import layeredarchitectureexample.exceptions.PasswordMismatchException;
import layeredarchitectureexample.exceptions.UserNotFoundException;
import layeredarchitectureexample.model.Login;

public class LoginServiceImpl implements LoginService {

	@Override
	public String verifyUserNameAndPassword(Login login) {
		LoginDAO loginDAO = new LoginDAOImpl();
		try {
			Login loginFromDB = loginDAO.getUserDetails(login.getUserName());
			if (loginFromDB != null) {
				if (login.getPassword().equals(loginFromDB.getPassword())) {
					return "User logged in successfully";
				} else {
					//throw new PasswordMismatchException();
					throw new PasswordMismatchException("User details mismatch");
				}
			} else {
				throw new UserNotFoundException();
			}
		} catch (UserNotFoundException e) {

			return "Username doesn't exists in our system";
		} catch (PasswordMismatchException pme) {
			//return "User details mismatch";
			return pme.getMessage();
		}

	}

}
