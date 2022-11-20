package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "cart")
public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cart")
	private long id;
	
	@Column(name = "nameCart")
	private String nameCart;
	@Column(name = "price")
	private String price;
	@Column(name = "img")
	private String img;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "isExist")
	private Integer isExist;

	
	public String getNameCart() {
		return nameCart;
	}
	public void setNameCart(String nameCart) {
		this.nameCart = nameCart;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int isExist() {
		return isExist;
	}
	public void setExist(int isExist) {
		this.isExist = isExist;
	}

	
	
}
