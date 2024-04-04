package studentassignment.exceptions;

//User defined exception class
public class DataNotPresentException extends Exception{

	public DataNotPresentException() {
		// TODO Auto-generated constructor stub
	}

	public DataNotPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DataNotPresentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataNotPresentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataNotPresentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
