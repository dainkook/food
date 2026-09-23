package com.kedu.dto;

import java.util.Date;

public class FoodsDTO {

	private int seq;
	private String foodname;
	private int price;
	private int stock;
	private String category;
	private Date expiry_date;
	
	public FoodsDTO() {
		
	}
	public FoodsDTO(int seq, String foodname, int price, int stock, String category, Date expiry_date) {
		super();
		this.seq = seq;
		this.foodname = foodname;
		this.price = price;
		this.stock = stock;
		this.category = category;
		this.expiry_date = expiry_date;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	
}