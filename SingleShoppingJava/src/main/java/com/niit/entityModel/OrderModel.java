package com.niit.entityModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TABLE")
public class OrderModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int OrderId;
	
	@ManyToOne
	@JoinColumn(name="username")
	private User user;
		
	@ManyToOne
	@JoinColumn(name="productId")
	private ProductModel productModel;
	 
	/*@Column
	private int quantity=1;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
*/
	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
