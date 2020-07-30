package com.webapp.bankingservice;

import java.io.Serializable;

import java.util.Date;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer accountId;

	private String accountName;

	private Double balance;

	private Date accountOpenDate;

	private Integer customerId;

	private Integer isActive;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accountId, String accountName, Double balance, Date accountOpenDate, Integer customerId,
			Integer isActive) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
		this.accountOpenDate = accountOpenDate;
		this.customerId = customerId;
		this.isActive = isActive;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance
				+ ", accountOpenDate=" + accountOpenDate + ", customerId=" + customerId + ", isActive=" + isActive
				+ "]";
	}

}
