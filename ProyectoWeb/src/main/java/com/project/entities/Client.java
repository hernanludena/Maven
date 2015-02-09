package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity
public class Client {
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="client_id_seq")
//	@SequenceGenerator(name="client_id_seq", sequenceName="client_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String nombre;	
	
	public Client(String nombre) {		
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
