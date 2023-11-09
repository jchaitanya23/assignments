package day21;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "categories")
@Entity(name = "day21.Category")
public class Category {
	@Id // primary key
	@Column(name = "CatCode")
	private String code;

	@Column(name = "catdesc")
	private String description;

	@OneToMany(mappedBy = "category")
	private List<Products> products = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}

}