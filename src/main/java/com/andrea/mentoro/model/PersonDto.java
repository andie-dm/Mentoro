package com.andrea.mentoro.model;

public class PersonDto {
	
	private String name;
	private Integer phoneNumber; 
	private Boolean likesCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getLikesCode() {
		return likesCode;
	}
	public void setLikesCode(Boolean likesCode) {
		this.likesCode = likesCode;
	}
	

}
