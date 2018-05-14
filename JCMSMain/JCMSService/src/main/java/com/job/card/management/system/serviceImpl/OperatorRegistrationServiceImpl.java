package com.job.card.management.system.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.card.management.system.dao.OperatorRegistrationDao;
import com.job.card.management.system.dto.OperatorDto;
import com.job.card.management.system.helper.OpratorHelper;
import com.job.card.management.system.service.OperatorRegistrationService;

@Service
public class OperatorRegistrationServiceImpl implements OperatorRegistrationService {

	@Autowired
	private OperatorRegistrationDao operatorRegistrationDao;

	@Override
	public boolean operatorRegistration(OperatorDto operatorDto) {
		System.out.println("This is operator service ... \nJoining Date : -"+operatorDto.getJoiningDate());
		return operatorRegistrationDao.operatorRegistration(OpratorHelper.getOpratorEntity(operatorDto));
	}

}