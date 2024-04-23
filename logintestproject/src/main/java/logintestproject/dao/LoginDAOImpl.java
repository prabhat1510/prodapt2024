package logintestproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;
import logintestproject.util.DBConnectionUtil;
import logintestproject.util.QUERYMAPPER;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public Login getLoginDetails(String userName) throws UserNameNotFoundException {
		Connection conn = DBConnectionUtil.getDBConnection();
		Login login = null;
		try (PreparedStatement pStmt = conn.prepareStatement(QUERYMAPPER.GET_LOGIN_DETAILS_BY_USERNAME);) {
			pStmt.setString(1, userName);
			ResultSet rs = pStmt.executeQuery();
			if(rs.next()) {
				login = new Login();
				login.setUserName(rs.getString("username"));
				login.setPassword(rs.getString("password"));
			}else {
				throw new UserNameNotFoundException("Details for username -- "+userName+" not found in records");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return login;
	}

}
