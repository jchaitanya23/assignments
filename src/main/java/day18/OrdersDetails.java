package day18;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrdersDetails {
	@Column(name = "prod_id")
	private int pid;
	
	@Column(name ="date", length=30)
	private String date;
	
	@Column(name ="quantity")
	private int qoh;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	
	
}
