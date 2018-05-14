package com.employee.web.util;

public class EmployeeUtil {
	
	public static boolean isEmpty(String field){
		boolean isEmpty = false;
		if(null == field || field.isEmpty())
			isEmpty = true;
		return isEmpty;
	}
	
	public static boolean isValidLength(String field,int maxLength){
		boolean isValid = false;
		if(field.length() > maxLength)
			isValid = true;
		return isValid;
	}
}
