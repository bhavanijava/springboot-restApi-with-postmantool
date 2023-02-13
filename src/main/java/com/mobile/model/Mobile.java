package com.mobile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MobileMgt")
public class Mobile {
	@Id
	private Integer modelNo;
	private String mobilename;
	private double price;
	private Integer quantity;
	private String description;
	
	// PDC+PPC+PSM+PGM+toString()

	public Mobile() {
		super();
	}

	public Mobile(Integer modelNo, String mobilename, double price, Integer quantity, String description) {
		super();
		this.modelNo = modelNo;
		this.mobilename = mobilename;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	public Integer getModelNo() {
		return modelNo;
	}

	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Mobile [modelNo=" + modelNo + ", mobilename=" + mobilename + ", price=" + price + ", quantity="
				+ quantity + ", description=" + description + "]";
	}
	
	
	
}
