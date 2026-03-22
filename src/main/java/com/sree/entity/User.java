package com.sree.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
	
	private int id;
	
	String name;
	
	private int age;

	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}
