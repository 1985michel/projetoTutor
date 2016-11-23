package com.testes;

import com.crud.MateriaDAO;
import com.model.Materia;

public class TesteCriarMateria {
	
	public static void main(String...args){
		Materia materia = new Materia();
		materia.setNomeMateria("Português");
		
		MateriaDAO.novaMateria(materia);
		
		System.out.println("ID: "+materia.getIdMateria());
	}

}
