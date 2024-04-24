package logintestproject.exceptions;

import lombok.Generated;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Generated
public class UserNameNotFoundException extends Exception{
	
	public UserNameNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserNameNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNameNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNameNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
