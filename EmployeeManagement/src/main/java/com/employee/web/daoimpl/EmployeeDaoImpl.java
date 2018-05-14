package com.employee.web.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.web.dao.EmployeeDao;
import com.employee.web.entity.EmployeeEntity;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory session;
	
	public EmployeeEntity save(EmployeeEntity emp) throws SQLException {
		int empId = (Integer) session.getCurrentSession().save(emp);
		emp.setId(empId);
		return emp;
	}

	public EmployeeEntity getEmployeeById(int id) throws SQLException {
		EmployeeEntity emp = (EmployeeEntity)session.getCurrentSession().get(EmployeeEntity.class, id);
		return emp;
	}

	public void deleteEmployee(EmployeeEntity emp) throws SQLException {
		session.getCurrentSession().delete(emp);
	}

	public List<EmployeeEntity> getEmployeeList() throws SQLException {
		//List<EmployeeEntity> empList = session.getCurrentSession().createQuery("from EmployeeEntity").list();
		List<EmployeeEntity> empList;
		Criteria cr = session.getCurrentSession().createCriteria(EmployeeEntity.class);
		/*cr.add(Restrictions.eq("name", "Nitin Gupta"));
		cr.add(Restrictions.eq("age", 20));*/
		return cr.list();
	}
	
	public List<EmployeeEntity> callNamedQuery()throws SQLException{
		List<EmployeeEntity> empList ;
		Query query = session.getCurrentSession().getNamedQuery("getEmployeeList");
		query.setParameter("name", "%Nitin%");
		empList = query.list();
		return empList;
	}
	
	public List<EmployeeEntity> callNativeSQL()throws SQLException{
		List<EmployeeEntity> empList ;
		String sql = "Select e from EMPLOYEE e";
		Query query = session.getCurrentSession().createSQLQuery(sql);
		EmployeeEntity emp =  new EmployeeEntity();
		query.setEntity("e",EmployeeEntity.class);
		/*List<Object[]> rows = query.list();
		for(Object[] row: rows){
			emp.setName(row[0].toString());
		}*/
		empList = query.list();
		return empList;
	}
	
}
