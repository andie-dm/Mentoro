package com.andrea.mentoro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person { 
//https://spring.io/guides/gs/accessing-data-mysql//

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id; 
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_number")
	private Long phoneNumber; 
	
	@Column(name = "likes_code")
	private Boolean likesCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getLikesCode() {
		return likesCode;
	}
	public void setLikesCode(Boolean likesCode) {
		this.likesCode = likesCode;
	}
}