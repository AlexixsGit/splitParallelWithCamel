package com.co.splitter.parallel.model;

public class ErrorResponse {

	public ErrorResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
