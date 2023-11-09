package day18;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OfficeAdd {
	@Column(length = 30)
	private String off_address;

	@Column(length = 30)
	private String off_city;

	public String getOff_address() {
		return off_address;
	}

	public void setOff_address(String off_address) {
		this.off_address = off_address;
	}

	public String getOff_city() {
		return off_city;
	}

	public void setOff_city(String off_city) {
		this.off_city = off_city;
	}

	

}
