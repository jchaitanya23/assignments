package day20;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="day20.Publisher")
@Table(name="publishers")
public class Publisher {
	@Id
	@Column(name="pub_id")
	private String id;
	
	@Column(name="pub_name")
	private String pub_name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="publisher")
	private List<Title> titles=new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPub_name() {
		return pub_name;
	}

	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", pub_name=" + pub_name + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
}