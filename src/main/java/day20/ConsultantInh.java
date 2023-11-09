package day20;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "day20.ConsultantInh")
@DiscriminatorValue("2")
public class ConsultantInh extends DoctorInh {
	@Column(name = "Charge")
	private int charge;

	@Column(name = "visits")
	private int visits;

	public double getSalary() {
		return this.visits * this.charge;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "ConsultantInh [charge=" + charge + ", visits=" + visits + ", getSalary()=" + getSalary()
				+ ", getName()=" + getName() + "]";
	}
	
	

}
