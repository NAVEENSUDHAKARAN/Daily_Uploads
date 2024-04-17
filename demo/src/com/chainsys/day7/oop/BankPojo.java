package com.chainsys.day7.oop;

public class BankPojo {

	int bankId, userId, balance,amount;
	String bankName, bankLocation, userName;
	double interestRate;
	long phoneNumber;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankPojo [bankId=" + bankId + ", userId=" + userId + ", balance=" + balance + ", amount=" + amount
				+ ", bankName=" + bankName + ", bankLocation=" + bankLocation + ", userName=" + userName
				+ ", interestRate=" + interestRate + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
