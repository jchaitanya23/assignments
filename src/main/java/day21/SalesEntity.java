package day21;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "sales")
@Entity(name = "day21.SalesEntity")

public class SalesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Invno")
	private int id;

	@Column(name = "Prodid")
	private int product_id;
	@Column(name = "Transdate")
	private String date;

	@Column(name = "Qty")
	private int quantity;

	@Column(name = "Amount")
	private double amount;

	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="prodid")
	private Products products;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Products getProducts() {
		return products;
	}


	public void setProducts(Products products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "SalesEntity [id=" + id + ", product_id=" + product_id + ", date=" + date + ", quantity=" + quantity
				+ ", amount=" + amount + "]";
	}
	
	

}
