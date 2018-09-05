package com.gccoffeeshop.SpringLab.entity;

public class Users {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private String username;
	private String password;
	
	public Users(String firstName, String lastName, String email, String phoneNum, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.username = username;
		this.password = password;
	}
	
	public Users() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNum = "";
		username = "";
		password = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum="
				+ phoneNum + ", username=" + username + ", password=" + password;
	}
	
	
}
