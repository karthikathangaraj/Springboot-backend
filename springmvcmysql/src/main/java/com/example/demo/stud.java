package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class stud {
	@Id
	private int id;
	private String name;
	private int phn;
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
	
	@Override
	public String toString() {
		return "stud [id=" + id + ", name=" + name + ", phn=" + phn + "]";
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	

}
