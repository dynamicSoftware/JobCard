package com.employee.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.employee.web.entity.EmployeeEntity;

public interface EmployeeDao {
	
	public EmployeeEntity save(EmployeeEntity emp) throws SQLException;
	public EmployeeEntity getEmployeeById(int id) throws SQLException;
	public void deleteEmployee(EmployeeEntity emp) throws SQLException;
	public List<EmployeeEntity> getEmployeeList() throws SQLException;
	public List<EmployeeEntity> callNamedQuery()throws SQLException;
	public List<EmployeeEntity> callNativeSQL()throws SQLException;
}
