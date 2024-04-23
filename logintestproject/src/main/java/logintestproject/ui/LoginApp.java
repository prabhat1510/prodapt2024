package logintestproject.ui;

import java.util.Scanner;

import logintestproject.exceptions.PasswordMismatchException;
import logintestproject.exceptions.UserNameNotFoundException;
import logintestproject.model.Login;
import logintestproject.service.LoginService;
import logintestproject.service.LoginServiceImpl;

public class LoginApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String userName = sc.next();
		
		System.out.println("Enter password : ");
		String password = sc.next();
		Login login = new Login();
		login.setPassword(password);
		login.setUserName(userName);
		
		LoginService service = new LoginServiceImpl();
		String message;
		try {
			message = service.verifyUserNameAndPassword(login);
			System.out.println(message);
		} catch (UserNameNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
