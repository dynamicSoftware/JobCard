package com.job.card.management.system.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class OperatorDto extends UserDto {

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
}