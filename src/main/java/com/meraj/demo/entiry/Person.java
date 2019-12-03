package com.meraj.demo.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Person {
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id
	@GeneratedValue
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
