package logintestproject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		} catch (UserNameNotFoundException | PasswordMismatchException e) {
			assertNotEquals(expectedMessage,e.getMessage());
		}
		
		assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	void testVerifyUserNameAndPasswordNotSuccess(){
		login.setUserName("admin111");
		login.setPassword("password");
		String expectedMessage ="Details for username -- "+login.getUserName()+" not found in records";
		
		String actualMessage = null;
		try {
			actualMessage =loginService.verifyUserNameAndPassword(login);
		} catch (UserNameNotFoundException e) {
			assertEquals(expectedMessage,e.getMessage());
		} catch (PasswordMismatchException e) {
			assertEquals("Password for username " + login.getUserName() + "doesn't match with our record",e.getMessage());
		}
		
		assertNotEquals(expectedMessage, actualMessage);
	}
	
	@Test
	void testVerifyUserNameAndPasswordUserNameNotFoundException() {
		login.setUserName("admin111");
		login.setPassword("password");
		assertThrows(UserNameNotFoundException.class,()->loginService.verifyUserNameAndPassword(login));
		
	}
	
	@Test
	void testVerifyUserNameAndPasswordPasswordMismatchException() {
		login.setUserName("admin");
		login.setPassword("password111");
		assertThrows(PasswordMismatchException.class,()->loginService.verifyUserNameAndPassword(login));
		
	}
	
	@AfterEach
	void tearDown() {
		loginService = null;
		login=null;
	}
}
