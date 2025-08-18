package com.andrea.mentoro.model;

public class PersonDto {
	
	private Long id;
	private String name;
	private String phoneNumber; 
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getLikesCode() {
		return likesCode;
	}
	public void setLikesCode(Boolean likesCode) {
		this.likesCode = likesCode;
	}
	

}
