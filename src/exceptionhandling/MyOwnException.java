package exceptionhandling;

public class MyOwnException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Constructor of custom exception class here I am copying the message that we
	 * are passing while throwing the exception to a string and then displaying that
	 * string along with the message.
	 */
	MyOwnException(String message) {
		super(message);
	}

}