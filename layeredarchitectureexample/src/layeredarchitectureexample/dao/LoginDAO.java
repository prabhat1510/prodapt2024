package layeredarchitectureexample.dao;

import layeredarchitectureexample.model.Login;

public interface LoginDAO {
		public Login getUserDetails(String userName);
}
