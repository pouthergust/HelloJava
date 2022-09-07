package com.company;

@SuppressWarnings("serial")
public class MyException extends Exception {

	private String exception;

	public MyException(String exception) {
		this.exception = exception;
	}

	public String getException() {
		return exception;
	}
	
}
