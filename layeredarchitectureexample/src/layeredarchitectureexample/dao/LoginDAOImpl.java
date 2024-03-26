package layeredarchitectureexample.dao;

import layeredarchitectureexample.model.Login;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public Login getUserDetails(String userName) {
		//In real application login details we will get it from DB
		Login login = new Login("admin", "password");
		
		if(login.getUserName().equals(userName)) {
			return login;
		}
		return null;
	}

}
