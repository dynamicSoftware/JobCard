package com.employee.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOBBY")
public class HobbiesEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6976407470235270248L;
	private int hobbyId;
	private String hobby;
	
	
	public HobbiesEntity() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOBBY_ID")
	public int getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(int hobbyId) {
		this.hobbyId = hobbyId;
	}
	
	@Column(name="HOBBY")
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public HobbiesEntity(int hobbyId, String hobby) {
		super();
		this.hobbyId = hobbyId;
		this.hobby = hobby;
	}
	
}
