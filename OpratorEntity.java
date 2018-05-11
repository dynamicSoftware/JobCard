package com.job.card.management.system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OPRATOR_DETAILS")
public class OpratorEntity  extends UserEntity {

	@Column(name="JOINING_DATE")
	private Date joiningDate;
	@Column(name="SALARY")
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

}
