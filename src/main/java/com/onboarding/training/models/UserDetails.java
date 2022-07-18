package com.onboarding.training.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Details")
public class UserDetails {

	@Id
	private Long userId;
	private String name;
	private String emailId;
	private String mobileNo;
	private String secMob;
	private String dob;
	private String gender;
	
	public UserDetails() {
		super();
	}

	public UserDetails(Long userId, String name, String emailId, String mobileNo, String secMob, String dob, String gender) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.secMob = secMob;
		this.dob = dob;
		this.gender = gender;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSecMob() {
		return secMob;
	}

	public void setSecMob(String secMob) {
		this.secMob = secMob;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", secMob=" + secMob + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
}
