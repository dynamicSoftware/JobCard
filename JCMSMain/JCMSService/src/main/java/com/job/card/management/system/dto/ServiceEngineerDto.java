package com.job.card.management.system.dto;

import java.util.Date;


public class ServiceEngineerDto extends UserDto {

	private static final long serialVersionUID = -395141129163768950L;
	
	private String experience;
	private Date joiningDate;
	private String specialist;
	private Double salary;

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ServiceEngineerDto [experience=" + experience + ", joiningDate=" + joiningDate + ", specialist="
				+ specialist + ", salary=" + salary + ", getUserAddress()=" + getUserAddress() + ", getUserGender()="
				+ getUserGender() + ", getUserEmail()=" + getUserEmail() + ", getUserContact()=" + getUserContact()
				+ ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName() + ", getUserPassword()="
				+ getUserPassword() + ", getUserRole()=" + getUserRole() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}