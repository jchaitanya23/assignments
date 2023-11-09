package day18;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "day18.Customer")
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 30)
	private String name;

	@Embedded
	private Address home;
	@Embedded
	private OfficeAdd Offc;
	@Embedded
	private AddCustContact con;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHome() {
		return home;
	}

	public void setHome(Address a) {
		this.home = a;
	}
	
	public void setOff(OfficeAdd d) {
		this.Offc=d;
	}
	public void setCon(AddCustContact c) {
		this.con=c;
	}

}
