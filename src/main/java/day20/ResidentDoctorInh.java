package day20;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="day20.ResidentDoctorInh")
@DiscriminatorValue("1")
public class ResidentDoctorInh extends DoctorInh {
	@Column(name="Salary")
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ResidentDoctorInh [salary=" + salary + ", getName()=" + getName() + "]";
	}
	
	
}	
