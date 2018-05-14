package com.employee.web.validator;

import java.util.ArrayList;
import java.util.List;

import com.employee.web.model.EmployeeModel;
import com.employee.web.util.EmployeeUtil;

public class EmployeeValidator {
	
	public static List<String> validateEmployee(EmployeeModel emp){
		List<String> errMsgs = new ArrayList<String>();
		
		if(EmployeeUtil.isEmpty(emp.getfName()))
			errMsgs.add("First Name should not be empty");
		if(EmployeeUtil.isValidLength(emp.getfName(), 20))
			errMsgs.add("First Name should not be greater than 20");
		return errMsgs;
	}
}
