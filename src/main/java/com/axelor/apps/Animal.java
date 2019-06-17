package com.axelor.apps;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	
	
	@Id 
	private int aid;
	private String aname;
	
	
	Animal(){}
	
	public Animal(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Animal [aid=" + aid + ", aname=" + aname + "]";
	}
}
