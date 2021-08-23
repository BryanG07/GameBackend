package com.example.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "bool")
public class Bool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String disponible;
	
	public Bool(Long id, String disponible) {
		super();
		this.id = id;
		this.disponible = disponible;
	}
	
	public Bool() {

	}

	public Long getId() {
		return id;
	}

	public void setId_n(Long id) {
		this.id = id;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	
}
