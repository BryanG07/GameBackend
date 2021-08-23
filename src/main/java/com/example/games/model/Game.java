package com.example.games.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String imagen;
	private String nombre;
	private boolean disponible;
	private int precio;
	private String fecha;
	private String protagonista;
	private String director;
	private String productor;
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "id_technology")
	private Technology technology;
	
	@ManyToOne
	@JoinColumn(name = "id_bool")
	private Bool bool;

	public Game(String imagen, String nombre, boolean disponible,int precio, String fecha, String protagonista,
			String director, String productor, int cantidad, Technology technology, Bool bool) {
		super();
		this.imagen = imagen;
		this.nombre = nombre;
		this.disponible = disponible;
		this.precio = precio;
		this.fecha = fecha;
		this.protagonista = protagonista;
		this.director = director;
		this.productor = productor;
		this.cantidad = cantidad;
		this.technology = technology;
		this.bool = bool;
	}

	public Game() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Technology getTechnology() {
		return technology;
	}
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	public Bool getBool() {
		return bool;
	}
	public void setBool(Bool bool) {
		this.bool = bool;
	}
}
