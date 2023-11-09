package day20;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="day20.Author")
@Table(name ="authors")
public class Author {
	@Id
	@Column(name="au_id")
	private String id;
	
	@Column(name = "au_fname")
	private String name;
	
	
	@ManyToMany(mappedBy="authors")
	Set<Title> title =new HashSet<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Title> getTitle() {
		return title;
	}

	public void setTitle(Set<Title> title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
