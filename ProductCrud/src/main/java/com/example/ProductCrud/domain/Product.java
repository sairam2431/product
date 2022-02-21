package com.example.ProductCrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long product_id;
    private String productname;
    private String description;
    private int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long product_id, String productname, String description, int price) {
		super();
		this.product_id = product_id;
		this.productname = productname;
		this.description = description;
		this.price = price;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	

}
