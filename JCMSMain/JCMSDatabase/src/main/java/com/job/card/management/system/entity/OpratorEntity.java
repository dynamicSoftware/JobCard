package com.job.card.management.system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "OPRATOR_DETAILS")
//@PrimaryKeyJoinColumn(name="userId")
@DiscriminatorValue(value="OpratorEntity")
public class OpratorEntity extends UserEntity {

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "SALARY")
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
		return "OpratorEntity [joiningDate=" + joiningDate + ", salary=" + salary + ", getUserAddress()="
				+ getUserAddress() + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getUserPassword()=" + getUserPassword() + ", getUserRole()=" + getUserRole()
				+ ", getUserContact()=" + getUserContact() + ", getUserGender()=" + getUserGender()
				+ ", getUserEmail()=" + getUserEmail() + "]";
	}

}