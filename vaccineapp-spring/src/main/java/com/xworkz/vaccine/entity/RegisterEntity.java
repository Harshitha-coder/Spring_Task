package com.xworkz.vaccine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccineregistration_table")
public class RegisterEntity implements Serializable {

	@Id
	@Column(name = "V_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "V_USERNAME")
	private String userName;
	@Column(name = "V_EMAIL")
	private String email;
	@Column(name = "V_PASSWORD")
	private String password;
	@Column(name = "V_PHONENUM")
	private long phoneNum;
	@Column(name = "V_VACCINETYPE")
	private String vaccineType;
	@Column(name = "V_AADHARNUM")
	private long aadharNum;
	@Column(name = "V_GENDER")
	private String gender;

	public RegisterEntity() {

	}

	public RegisterEntity(String userName, String email, String password, long phoneNum, String vaccineType,
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
		return "RegisterEntity [userName=" + userName + ", email=" + email + ", password=" + password + ", phoneNum="
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

}
