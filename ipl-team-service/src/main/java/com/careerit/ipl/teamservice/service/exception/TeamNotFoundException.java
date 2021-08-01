package com.careerit.ipl.teamservice.service.exception;

public class TeamNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7619872994807448115L;

	public TeamNotFoundException(String message) {
			super(message);
		}
}
