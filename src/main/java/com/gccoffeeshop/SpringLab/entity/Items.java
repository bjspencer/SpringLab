package com.gccoffeeshop.SpringLab.entity;

public class Items {
	private String itemName;
	private String description;
	private String price;
	
	public Items(String itemName, String description, String price) {
		
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}
	
	public Items() {
		itemName = "";
		description = "";
		price = "";
	}

	public String getName() {
		return itemName;
	}

	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + itemName + ", description=" + description + ", price=" + price;
	}
	
	
}
