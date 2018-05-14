package com.job.card.management.system.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class OperatorDto extends UserDto {

	private static final long serialVersionUID = 1758262185438515309L;

	private Date joiningDate;
	private Double salary;

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "OperatorDto [joiningDate=" + joiningDate + ", salary=" + salary + ", getUserAddress()="
				+ getUserAddress() + ", getUserGender()=" + getUserGender() + ", getUserEmail()=" + getUserEmail()
				+ ", getUserContact()=" + getUserContact() + ", getUserId()=" + getUserId() + ", getUserName()="
				+ getUserName() + ", getUserPassword()=" + getUserPassword() + ", getUserRole()=" + getUserRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}