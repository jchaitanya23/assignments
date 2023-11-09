package day18;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity(name = "day18.OrdersCollection")
@Table(name = "Col_orders")
public class OrdersCollection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;

	@Column(length = 30)
	private String cust_name;

	@ElementCollection
	@CollectionTable(name = "OrdersDetails", joinColumns = @JoinColumn(name = "customer_id"))
	@Embedded
	private Set<OrdersDetails> quantities = new HashSet<OrdersDetails>();

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Set<OrdersDetails> getQuantities() {
		return quantities;
	}

	public void setQuantities(Set<OrdersDetails> quantities) {
		this.quantities = quantities;
	}

}
