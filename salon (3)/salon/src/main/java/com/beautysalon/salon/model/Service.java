package com.beautysalon.salon.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long srid;
	private String srname;
	private String description;
	private int price;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
		@JoinTable(name="services_images",joinColumns={
			@JoinColumn(name="service_srid")
		},
		inverseJoinColumns= {
				@JoinColumn(name="image_id")
		}
		)
	private Set<ImageModel> servicesImages;
	
	public Set<ImageModel> getServicesImages(){
		return servicesImages;
	}
	public void setServicesImages(Set<ImageModel>servicesImages) {
		this.servicesImages=servicesImages;
		
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String srname, String description, int price) {
		super();
		this.srname = srname;
		this.description = description;
		this.price = price;
	}
	public long getSrid() {
		return srid;
	}
	public void setSrid(long srid) {
		this.srid = srid;
	}
	public String getSrname() {
		return srname;
	}
	public void setSrname(String srname) {
		this.srname = srname;
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
		return "Services [srid=" + srid + ", srname=" + srname + ", description=" + description + ", price=" + price
				+ ", servicesImages=" + servicesImages + "]";
	}
	
	
	
	
	
}
