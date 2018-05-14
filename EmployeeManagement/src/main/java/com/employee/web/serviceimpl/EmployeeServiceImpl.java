package com.employee.web.serviceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.employee.web.dao.EmployeeDao;
import com.employee.web.entity.EmployeeEntity;
import com.employee.web.exception.EmployeeException;
import com.employee.web.helper.EmployeeHelper;
import com.employee.web.model.EmployeeModel;
import com.employee.web.service.EmployeeService;
import com.employee.web.util.EmployeeConstant;
import com.employee.web.validator.EmployeeValidator;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	

	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public EmployeeModel saveEmployee(EmployeeModel emp) throws EmployeeException, SQLException{
		List<String> errMsgs = EmployeeValidator.validateEmployee(emp);
		if(errMsgs.size() != 0)
			throw new EmployeeException(EmployeeConstant.BAD_REQUEST, EmployeeConstant.ERROR_MSG, errMsgs);
		EmployeeEntity empEntity = EmployeeHelper.buildEmployeeEntity(emp);
		EmployeeEntity empEnt = employeeDao.save(empEntity);

		return emp;
	}
	
	@Transactional
	public EmployeeModel getEmployeeById(int id) throws EmployeeException, SQLException {
		EmployeeModel emp = new EmployeeModel();
		EmployeeEntity empEntity = employeeDao.getEmployeeById(id);
		System.out.println(empEntity.toString());
		emp = EmployeeHelper.buildEmployeeModel(empEntity);
		return emp;
	}

	@Transactional
	public List<EmployeeModel> deleteEmployee(int id) throws EmployeeException,
			SQLException {
		boolean isDeleted = false;
		EmployeeEntity emp = new EmployeeEntity();
		emp.setId(id);
		employeeDao.deleteEmployee(emp);
		isDeleted = true;
		List<EmployeeModel> empList = getEmployeeList();
		return empList;
	}
	
	@Transactional
	public List<EmployeeModel> getEmployeeList() throws EmployeeException,
			SQLException {
		List<EmployeeEntity> empList = employeeDao.getEmployeeList();
		List<EmployeeModel> empModels = new ArrayList<EmployeeModel>();
		for(EmployeeEntity empEntity: empList){
			empModels.add(EmployeeHelper.buildEmployeeModel(empEntity));
		}
		return empModels;
	}

	@Transactional
	public List<EmployeeModel> callNamedQuery() throws EmployeeException,
			SQLException {
		List<EmployeeModel> empModels = new ArrayList<EmployeeModel>();
		List<EmployeeEntity> empList = employeeDao.callNamedQuery();
		for(EmployeeEntity emp: empList){
			empModels.add(EmployeeHelper.buildEmployeeModel(emp));
		}
		return empModels;
	}

	@Transactional
	public List<EmployeeModel> callNativeSQL() throws EmployeeException,
			SQLException {
		List<EmployeeModel> empModels = new ArrayList<EmployeeModel>();
		List<EmployeeEntity> empList = employeeDao.callNativeSQL();
		for(EmployeeEntity emp: empList){
			empModels.add(EmployeeHelper.buildEmployeeModel(emp));
		}
		return empModels;
	}
	

}
