package day19;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "day19.SalesManyToOne")
@Table(name = "sales")
public class SalesManyToOne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invno")
	private int invno;

	@Column(name = "transdate")
	private String transdate;

	@Column(name = "qty")
	private int qty;

	@Column(name = "amount")
	private double amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prodid", insertable = false, updatable = false)
	private ProductsOneToMany products;

	public int getInvno() {
		return invno;
	}

	public void setInvno(int invno) {
		this.invno = invno;
	}

	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public ProductsOneToMany getProducts() {
		return products;
	}

	public void setProducts(ProductsOneToMany products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "SalesManyToOne [invno=" + invno + ", transdate=" + transdate + ", qty=" + qty + ", amount=" + amount
				+ ", products=" + products + "]";
	}
	

	

}
