package com.birprojedaha.common.model;

import java.io.Serializable;

public class BaseResponseModel implements Serializable {
	private static final long serialVersionUID = -1626350357015050829L;

	private boolean success;
	private String errorCode;
	private String errorMessage;
	

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
