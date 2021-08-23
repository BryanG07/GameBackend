package com.example.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "technology")
public class Technology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String plataforma;

	public Technology(int id, String plataforma) {
		super();
		this.id = id;
		this.plataforma = plataforma;
	}

	public Technology() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
