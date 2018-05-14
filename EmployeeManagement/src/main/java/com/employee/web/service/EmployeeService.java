package com.employee.web.service;

import java.sql.SQLException;
import java.util.List;

import com.employee.web.entity.EmployeeEntity;
import com.employee.web.exception.EmployeeException;
import com.employee.web.model.EmployeeModel;

public interface EmployeeService {
	public EmployeeModel saveEmployee(EmployeeModel emp)throws EmployeeException, SQLException;
	public EmployeeModel getEmployeeById(int id) throws EmployeeException, SQLException;
	public List<EmployeeModel> deleteEmployee(int id) throws EmployeeException, SQLException;
	public List<EmployeeModel> getEmployeeList() throws EmployeeException, SQLException;
	public List<EmployeeModel> callNamedQuery()throws EmployeeException, SQLException;
	public List<EmployeeModel> callNativeSQL()throws EmployeeException, SQLException;
}
