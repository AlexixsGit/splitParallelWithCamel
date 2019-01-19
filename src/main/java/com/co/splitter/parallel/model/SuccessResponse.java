package com.co.splitter.parallel.model;

public class SuccessResponse {

	private boolean validated = false;

	public SuccessResponse(boolean validated) {
		this.validated = validated;
	}

	public SuccessResponse() {
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

}
