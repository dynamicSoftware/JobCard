package com.employee.web.exception;

import java.util.List;

public class EmployeeException extends Exception{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int statusCode;
	private String status;
	private List<String> msgs;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getMsgs() {
		return msgs;
	}
	public void setMsgs(List<String> msgs) {
		this.msgs = msgs;
	}
	public EmployeeException(int statusCode, String status, List<String> msgs) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.msgs = msgs;
	}
	
}
