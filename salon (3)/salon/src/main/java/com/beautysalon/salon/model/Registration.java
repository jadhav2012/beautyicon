package com.beautysalon.salon.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Registration {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int regid;
	private String name,address,contact,emailid,password;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration( String name, String address, String contact, String emailid, String password) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.emailid = emailid;
		this.password = password;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [regid=" + regid + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", emailid=" + emailid + ", password=" + password + "]";
	}
	
}


