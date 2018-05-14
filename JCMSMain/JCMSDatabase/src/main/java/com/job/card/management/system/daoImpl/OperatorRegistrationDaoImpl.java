package com.job.card.management.system.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.job.card.management.system.dao.OperatorRegistrationDao;
import com.job.card.management.system.entity.OpratorEntity;

@Repository
@Transactional
public class OperatorRegistrationDaoImpl implements OperatorRegistrationDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean operatorRegistration(OpratorEntity opratorEntity) {
		/*System.out.println("This is Operator Registration Dao Impl ... ");
		System.out.println(opratorEntity);*/

		
		System.out.println("This is Dao Layer");
		 hibernateTemplate.save(opratorEntity);
		System.out.println("Entity Saved ...");
		return false;
	}

}