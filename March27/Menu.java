package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	private int menId;
	private String menItem;
	private double menPrice;
	private double menCalories;
	
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getMenItem() {
		return menItem;
	}
	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}
	public double getMenPrice() {
		return menPrice;
	}
	public void setMenPrice(double menPrice) {
		this.menPrice = menPrice;
	}
	public double getMenCalories() {
		return menCalories;
	}
	public void setMenCalories(double menCalories) {
		this.menCalories = menCalories;
	}

	public Menu() {

	}
	public Menu(int menId, String menItem, double menPrice, double menCalories) {
		this.menId = menId;
		this.menItem = menItem;
		this.menPrice = menPrice;
		this.menCalories = menCalories;
	}
	
	
}
