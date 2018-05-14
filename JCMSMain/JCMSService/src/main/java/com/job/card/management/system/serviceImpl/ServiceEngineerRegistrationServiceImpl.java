package com.job.card.management.system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.card.management.system.dao.ServiceEngineerRegistrationDao;
import com.job.card.management.system.dto.ServiceEngineerDto;
import com.job.card.management.system.helper.ServiceEngineerHelper;
import com.job.card.management.system.service.ServiceEngineerRegistrationService;

@Service
public class ServiceEngineerRegistrationServiceImpl implements ServiceEngineerRegistrationService {

	@Autowired
	private ServiceEngineerRegistrationDao serviceEngineerRegistrationDao; 
	
	@Override
	public boolean serviceEngineerRegistration(ServiceEngineerDto engineerDto) {

		System.out.println("This is Service Engineer Registration ServiceImpl...");
		
		return serviceEngineerRegistrationDao.serviceEngineerRegistration(ServiceEngineerHelper.getServiceEngineerEntity(engineerDto));
	}

}
