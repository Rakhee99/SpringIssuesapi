package com.example.issues.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Matter 
{
	@Id
	@GeneratedValue
	private int aid;
	private String label;
	private String description;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Matter [aid=" + aid + ", label=" + label + ", description=" + description + "]";
	}
	
	
	
}
