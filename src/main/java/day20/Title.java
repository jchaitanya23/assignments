package day20;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="day20.Title")
@Table(name="titles")
public class Title {
	
	@Id
	@Column(name ="title_id",length=10)
	private String id;
	
	@Column(name="title")
	private String title;
	
	@Column(name ="price")
	private Double price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pub_id")
	private Publisher publisher;
	
	@ManyToMany
	@JoinTable(
			name="titleauthor",
			joinColumns=@JoinColumn(name ="title_id"),
			inverseJoinColumns=@JoinColumn(name="au_id"))
	
	Set<Author> authors= new HashSet<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + ", price=" + price + "]";
	}

	
	
	
	
	
	
}
	
	
	
