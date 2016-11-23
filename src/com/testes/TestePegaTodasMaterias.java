package com.testes;

import java.util.List;

import com.crud.MateriaDAO;
import com.model.Materia;

public class TestePegaTodasMaterias {

	public static void main(String[] args) {

		List<Materia> lista = MateriaDAO.getTodasMaterias();
		
		for (Materia m : lista) {
			System.out.println(m.idMateria+" - "+m.getNomeMateria());
		}

	}

}
