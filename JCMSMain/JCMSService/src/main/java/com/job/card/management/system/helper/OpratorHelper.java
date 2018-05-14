package com.job.card.management.system.helper;

import com.job.card.management.system.dto.OperatorDto;
import com.job.card.management.system.entity.OpratorEntity;

public class OpratorHelper {

	public static OpratorEntity  getOpratorEntity(OperatorDto operatorDto) {

		OpratorEntity opratorEntity = new OpratorEntity();
		opratorEntity.setUserId(operatorDto.getUserId());
		opratorEntity.setUserName(operatorDto.getUserName());
		opratorEntity.setUserContact(operatorDto.getUserContact());
		opratorEntity.setUserPassword(operatorDto.getUserPassword());
		opratorEntity.setUserEmail(operatorDto.getUserEmail());
		opratorEntity.setUserRole(operatorDto.getUserRole());
		opratorEntity.setUserGender(operatorDto.getUserGender());
		opratorEntity.setUserAddress(operatorDto.getUserAddress());
		opratorEntity.setSalary(operatorDto.getSalary());
		opratorEntity.setJoiningDate(operatorDto.getJoiningDate());
		return opratorEntity;
	}
}