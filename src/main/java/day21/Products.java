package day21;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "products")
@Entity(name = "day21.Products")

public class Products {
	@Id // Primary Key
	@Column(nullable = false)
	private int ProdId;
	@Column(name = "ProdName")
	private String productName;
	@Column(name = "Price ")
	private double price;
	@Column(name = "Qoh")
	private int qoh;
	@Column(name = "Remarks")
	private String remarks;
	@Column(name = "CatCode")
	private String catcode;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
	private List<SalesEntity> sales = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CatCode",insertable=false ,updatable=false)
	private Category category;

	
	public int getProdId() {
		return ProdId;
	}


	public void setProdId(int prodId) {
		ProdId = prodId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQoh() {
		return qoh;
	}


	public void setQoh(int qoh) {
		this.qoh = qoh;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getCatcode() {
		return catcode;
	}


	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}


	public List<SalesEntity> getSales() {
		return sales;
	}


	public void setSales(List<SalesEntity> sales) {
		this.sales = sales;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Products [ProdId=" + ProdId + ", productName=" + productName + ", price=" + price + ", qoh=" + qoh
				+ ", remarks=" + remarks + ", catcode=" + catcode + "]";
	}
	
	

}
