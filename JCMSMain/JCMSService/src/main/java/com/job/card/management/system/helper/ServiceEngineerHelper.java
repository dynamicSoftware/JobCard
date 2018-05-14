package com.job.card.management.system.helper;

import com.job.card.management.system.dto.ServiceEngineerDto;
import com.job.card.management.system.entity.ServiceEngineerEntity;

public class ServiceEngineerHelper {

	public static ServiceEngineerEntity getServiceEngineerEntity(ServiceEngineerDto engineerDto) {

		ServiceEngineerEntity serviceEngineerEntity = new ServiceEngineerEntity();

		serviceEngineerEntity.setUserId(engineerDto.getUserId());
		serviceEngineerEntity.setUserName(engineerDto.getUserName());
		serviceEngineerEntity.setUserContact(engineerDto.getUserContact());
		serviceEngineerEntity.setUserPassword(engineerDto.getUserPassword());
		serviceEngineerEntity.setUserEmail(engineerDto.getUserEmail());
		serviceEngineerEntity.setUserRole(engineerDto.getUserRole());
		serviceEngineerEntity.setUserGender(engineerDto.getUserGender());
		serviceEngineerEntity.setUserAddress(engineerDto.getUserAddress());
		serviceEngineerEntity.setSalary(engineerDto.getSalary());
		serviceEngineerEntity.setJoiningDate(engineerDto.getJoiningDate());
		serviceEngineerEntity.setExperience(engineerDto.getExperience());
		serviceEngineerEntity.setSpecialist(engineerDto.getSpecialist());

		return serviceEngineerEntity;
	}
}