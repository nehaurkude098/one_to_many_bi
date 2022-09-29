package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String toName;
	private String status;
	@OneToMany
	List<Item> item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettoName() {
		return toName;
	}
	public void settoName(String toName) {
		this.toName = toName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	

}
