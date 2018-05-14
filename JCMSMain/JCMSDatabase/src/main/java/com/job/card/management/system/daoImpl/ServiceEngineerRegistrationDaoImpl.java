package com.job.card.management.system.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.job.card.management.system.dao.ServiceEngineerRegistrationDao;
import com.job.card.management.system.entity.ServiceEngineerEntity;

@Repository
@Transactional
public class ServiceEngineerRegistrationDaoImpl implements ServiceEngineerRegistrationDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	@Override
	public boolean serviceEngineerRegistration(ServiceEngineerEntity engineerEntity) {

		System.out.println("This is Service Engineer Registration Dao Impl ...");

		System.out.println("This is service Dao Impl : "+engineerEntity);

		hibernateTemplate.save(engineerEntity);
		
		return false;
	}

}
