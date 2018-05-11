package com.job.card.management.system.daoImpl;

import org.springframework.stereotype.Repository;

import com.job.card.management.system.dao.UserRegistrationDao;
import com.job.card.management.system.entity.OpratorEntity;

@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao {

	@Override
	public void operatorRegistration(OpratorEntity opratorEntity) {
		System.out.println(opratorEntity);
	}

}
