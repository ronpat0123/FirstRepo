package com.RestService;

public class Alien {
	
	private int Id;
	private String name;
	private int points;
	
	
	
	
	public Alien() {
		
	}
	
	
	
	public Alien(int id, String name, int points) {
		super();
		Id = id;
		this.name = name;
		this.points = points;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
	

}
