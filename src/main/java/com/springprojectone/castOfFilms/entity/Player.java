package com.springprojectone.castOfFilms.entity;

public class Player {
	
	private int id;
	private String name;
	private String nationality;

	public Player(int id, String name, String nationality) {
		this.setId(id);
		this.setName(name);
		this.setNationality(nationality);		
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
