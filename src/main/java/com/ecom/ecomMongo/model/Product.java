package com.ecom.ecomMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author aryansh
 *
 */


@Document(collection = "ProductStore")
public class Product {
	@Id
	private int id;
	private String prdName;
	private String prdDesc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdDesc() {
		return prdDesc;
	}
	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}
	
	
}
