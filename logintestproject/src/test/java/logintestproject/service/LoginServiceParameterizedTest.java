package logintestproject.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;

//@ExtendWith(LoginParameterResolver.class)
public class LoginServiceParameterizedTest {

	private LoginService loginService;
	private Login login;
	@BeforeEach
	void init() {
		loginService = new LoginServiceImpl();
		login = new Login();
	}
	
	@org.junit.jupiter.params.ParameterizedTest
	@CsvSource({"userName , admin111","password,password"})
	void testVerifyUserNameAndPasswordUserNameNotFoundException(String userName,String passowrd) {
		login.setUserName(userName);
		login.setPassword(passowrd);
		assertThrows(UserNameNotFoundException.class,()->loginService.verifyUserNameAndPassword(login));
		
	}
}
