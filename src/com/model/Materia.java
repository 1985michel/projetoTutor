package com.model;

public class Materia {

	@Override
	public String toString() {
		return nomeMateria;
	}
	public int idMateria;
	public String nomeMateria;
	
	public Materia(){}
	
	public Materia(String nomeMateria) {
		super();
		this.nomeMateria = nomeMateria;
	}
	
	public Materia(int idMateria, String nomeMateria) {
		super();
		this.idMateria = idMateria;
		this.nomeMateria = nomeMateria;
	}
	
	
	
	
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	
	
}
