package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	private int walId;
	private int cusId;
	private String walSource;
	private double walAmount;
	
	public int getWalId() {
		return walId;
	}
	public void setWalId(int walId) {
		this.walId = walId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public double getWalAmount() {
		return walAmount;
	}
	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	public Wallet() {

	}
	public Wallet(int walId, int cusId, String walSource, double walAmount) {
		this.walId = walId;
		this.cusId = cusId;
		this.walSource = walSource;
		this.walAmount = walAmount;
	}
	
}
