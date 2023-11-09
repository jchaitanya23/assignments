package day18;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddCustContact {
	@Column(length = 30)
	private String email;

	@Column(length = 30)
	private String Mobile_No;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}

}
