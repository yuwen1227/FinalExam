package com.exam;

public class Food {
	public Food(int id, String name, int price, int kcal, int total) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kcal = kcal;
		this.total = total;
	}
	int id;
	String name;
	int price;
	int kcal;
	int total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
