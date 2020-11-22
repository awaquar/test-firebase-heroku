package com.hussain.model;

public class Intern {

	private String id;
	private String name;
	private double stiphen;
	public Intern(String id, String name, double stiphen) {
		super();
		this.id = id;
		this.name = name;
		this.stiphen = stiphen;
	}
	public Intern() {
		super();
	}
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
	public double getStiphen() {
		return stiphen;
	}
	public void setStiphen(double stiphen) {
		this.stiphen = stiphen;
	}
	@Override
	public String toString() {
		return "Intern [id=" + id + ", name=" + name + ", stiphen=" + stiphen + "]";
	}
	
	

}
