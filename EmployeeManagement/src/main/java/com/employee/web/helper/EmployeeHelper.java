package com.employee.web.helper;

import java.util.HashSet;
import java.util.Set;

import com.employee.web.entity.AddressEntity;
import com.employee.web.entity.EmployeeEntity;
import com.employee.web.entity.HobbiesEntity;
import com.employee.web.model.EmployeeModel;

public class EmployeeHelper {

	public static EmployeeEntity buildEmployeeEntity(EmployeeModel empModel){
		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setName(empModel.getfName() + " " + empModel.getlName());
		empEntity.setAge(empModel.getAge());
		empEntity.setEmail(empModel.getEmail());
		empEntity.setRemarks(empModel.getRemarks());
		AddressEntity address = new AddressEntity();
		address.setCity(empModel.getCity());
		address.setCountry(empModel.getCountry());
		address.setLocation(empModel.getStreet());
		empEntity.setAddress(address);
		Set<HobbiesEntity> hobbySet = new HashSet<HobbiesEntity>();
		HobbiesEntity hobbyEnt ;
		for(String hobby: empModel.getHobbies()){
			hobbyEnt = new HobbiesEntity();
			hobbyEnt.setHobby(hobby);
			hobbySet.add(hobbyEnt);
		}
		empEntity.setHobbies(hobbySet);
		return empEntity;
	}
	
	public static EmployeeModel buildEmployeeModel(EmployeeEntity empEntity  ){
		EmployeeModel empModel = new EmployeeModel();
		String []name = empEntity.getName().split(" ");
		
		empModel.setfName(name[0]);
		empModel.setlName(name[1]);
		empModel.setAge(empEntity.getAge());
		empModel.setEmail(empEntity.getEmail());
		empModel.setRemarks(empEntity.getRemarks());
		return empModel;
	}
}
