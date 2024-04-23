package logintestproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logintestproject.exceptions.PasswordMismatchException;
import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;

public class LoginServiceImplTest {
	
	private LoginService loginService;
	private Login login;
	@BeforeEach
	void init() {
		loginService = new LoginServiceImpl();
		login = new Login();
	}
	
	@Test
	void testVerifyUserNameAndPasswordSuccess(){
		login.setUserName("admin");
		login.setPassword("password");
		String expectedMessage ="Username and Password verified successfully";
		
		String actualMessage = null;
		try {
			actualMessage =loginService.verifyUserNameAndPassword(login);
		} catch (UserNameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PasswordMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expectedMessage, actualMessage);
	}
	
	@AfterEach
	void tearDown() {
		loginService = null;
		login=null;
	}
}
