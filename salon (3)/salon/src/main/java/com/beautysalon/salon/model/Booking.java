package com.beautysalon.salon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int srid;
	private String name,address;
	private String email;
	private int date;
	private int time;
	private int phoneno;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String name, String address, String email, int date, int time, int phoneno) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.date = date;
		this.time = time;
		this.phoneno = phoneno;
	}
	public int getSrid() {
		return srid;
	}
	public void setSrid(int srid) {
		this.srid = srid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Booking [srid=" + srid + ", name=" + name + ", address=" + address + ", email=" + email + ", date="
				+ date + ", time=" + time + ", phoneno=" + phoneno + "]";
	}
	
	
}
