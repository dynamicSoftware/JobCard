package com.job.card.management.system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_ENGINEER_DETAILS")
//@PrimaryKeyJoinColumn(name="userId")
@DiscriminatorValue(value="ServiceEngineerEntity")
public class ServiceEngineerEntity  extends UserEntity {

	@Column(name="EXPERIENCE")
	private String experience;
	
	@Column(name="SPECIALIST")
	private String Specialist ;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="SALARY")
	private Double salary;

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpecialist() {
		return Specialist;
	}

	public void setSpecialist(String specialist) {
		Specialist = specialist;
	}

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
		return "ServiceEngineerEntity [experience=" + experience + ", Specialist=" + Specialist + ", joiningDate="
				+ joiningDate + ", salary=" + salary + ", getUserAddress()=" + getUserAddress() + ", getUserId()="
				+ getUserId() + ", getUserName()=" + getUserName() + ", getUserPassword()=" + getUserPassword()
				+ ", getUserRole()=" + getUserRole() + ", getUserContact()=" + getUserContact() + ", getUserGender()="
				+ getUserGender() + ", getUserEmail()=" + getUserEmail() + "]";
	}

}