package day18;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Parking {
	@Column(name = "Parking_code")
	private int code;
	
	@Column(name="Parking_length")
	private int length;
	
	@Column(name="Parking_width")
	private int width ;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
