package firstmavenproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	
	//Static method which returns object of Connection type
	public static Connection getDBConnection(){
		Connection conn = null;
		
		try {
			conn= DriverManager.getConnection(QUERYMAPPER.URL,QUERYMAPPER.USERNAME,QUERYMAPPER.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
