package com.xworkz.vaccine.dto;

import java.io.Serializable;

public class RegisterDTO implements Serializable {

	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	private long phoneNum;
	private String vaccineType;
	private long aadharNum;
	private String gender;

	public RegisterDTO() {

	}

	public RegisterDTO(String userName, String email, String password, long phoneNum, String vaccineType,
			long aadharNum, String gender) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.vaccineType = vaccineType;
		this.aadharNum = aadharNum;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RegisterDTO [userName=" + userName + ", email=" + email + ", password=" + password + ", phoneNum="
				+ phoneNum + ", vaccineType=" + vaccineType + ", aadharNum=" + aadharNum + ", gender=" + gender + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public long getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
