package com.techietaught.springActuatorDemo.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

	@Id
	private String id;
	
	private String orderId;
	
	private String productName;
	
	private int quantity;
	
	private double price;
	
	private String shippingAddress;
	
	public Order() {
		
	}

	public Order(String id, String orderId, String productName, int quantity, double price, String shippingAddress) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.shippingAddress = shippingAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, orderId, price, productName, quantity, shippingAddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		return Objects.equals(id, other.id) && Objects.equals(orderId, other.orderId)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productName, other.productName) && quantity == other.quantity
				&& Objects.equals(shippingAddress, other.shippingAddress);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", shippingAddress=" + shippingAddress + "]";
	}
	
}
