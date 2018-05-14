package com.employee.web.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "EMPLOYEE")
@NamedQueries({ @NamedQuery(name = "getEmployeeList", query = "from EmployeeEntity where name like :name") })
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private int age;
	@Column(name = "EMAIL")
	private String email;

	AddressEntity address;
	@Column(name = "GENDER")
	
	private String gender;
	@Column(name = "HOBBIES")
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "EMPLOYEE_HOBBY", joinColumns = { @JoinColumn(name = "EMP_ID") }, 
			inverseJoinColumns = {@JoinColumn(name = "HOBBY_ID") })
	
	private Set<HobbiesEntity> hobbies = new HashSet<HobbiesEntity>(0);
	@Column(name = "REMARKS")
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<HobbiesEntity> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<HobbiesEntity> hobbies) {
		this.hobbies = hobbies;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	/*
	 * @Override public String toString() { return "EmployeeEntity [id=" + id +
	 * ", name=" + name + ", age=" + age + ", email=" + email + ", address=" +
	 * address + ", gender=" + gender + ", hobbies=" + hobbies + ", remarks=" +
	 * remarks + "]"; }
	 */

}
