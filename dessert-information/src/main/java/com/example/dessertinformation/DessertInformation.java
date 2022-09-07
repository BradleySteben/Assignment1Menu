package com.example.dessertinformation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DessertInformation {
	
	
	@Id
	private int id;
	
	private String name;
	
	private double price;
	
	private String description;


	
	public DessertInformation() {
		super();
	}
	
	
	public DessertInformation(int id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
