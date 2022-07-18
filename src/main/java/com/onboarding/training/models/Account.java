package com.onboarding.training.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private Long accountId;
	private Long userId;
	private String branchName;
	private String accountType;
	private Double accountBalance;
	
	public Account() {
		super();
	}

	public Account(Long accountId, Long userId, String branchName, String accountType, Double accountBalance) {
		super();
		this.accountId = accountId;
		this.userId = userId;
		this.branchName = branchName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", userId=" + userId + ", branchName=" + branchName
				+ ", accountType=" + accountType + ", accountBalance=" + accountBalance + "]";
	}
	
}
