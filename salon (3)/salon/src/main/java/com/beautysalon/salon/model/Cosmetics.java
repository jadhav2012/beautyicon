package com.beautysalon.salon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cosmetics {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name,description;
	private int price;
	public Cosmetics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cosmetics(String name, String description, int price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cosmetics [cid=" + cid + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
