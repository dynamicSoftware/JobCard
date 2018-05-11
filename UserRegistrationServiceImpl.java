package com.job.card.management.system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.card.management.system.dao.UserRegistrationDao;
import com.job.card.management.system.dto.OperatorDto;
import com.job.card.management.system.helper.OpratorHelper;
import com.job.card.management.system.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	@Autowired
	private UserRegistrationDao userDao;

	@Override
	public void operatorRegistration(OperatorDto operatorDto) {
		userDao.operatorRegistration(OpratorHelper.getOpratorEntity(operatorDto));
	}

}
