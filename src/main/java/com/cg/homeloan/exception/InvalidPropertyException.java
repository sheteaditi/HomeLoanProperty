package com.cg.homeloan.exception;

public class InvalidPropertyException {
	
	private int statusCode;
    private String errorMessage;

    public InvalidPropertyException(int statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
	


}
