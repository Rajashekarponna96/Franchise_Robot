package com.roboserver.common;

public enum CommonExceptionMessage {
	REQUIRED_ATTRIBUTE(1, " %name  is mandatory"), REQUIRED_EMAIL(2, "Please enter valid email"),
	INCORRECT_PIN(3, "User PIN is incorrect."), ALREADY_EXISTS(4, "%1$S is already exists."),
	REQUIRED_PHONENUMBER(5, "valid phonumy"), VALIDATE_TODATE(5, "To Date mandatory"),
	PERMISSION_NOTEXISTS(5, "You dont have permission to access this screen."), NOTFOUND(6, "%1$ not found."),
	VALIDATE_SIX_PIN(7, "Please enter only 6 digit PIN"),
	INCORRECT_UserNameAndPassword(8, "UserName and Password is incorrect."),
	ALREADY_ASSIGN(9, "Kiosk Configured Already.");

	private int code;

	private String message;

	CommonExceptionMessage(int i, String message) {
		this.code = i;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessgae() {
		return message;
	}

}
