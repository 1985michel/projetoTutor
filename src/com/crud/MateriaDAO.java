package com.crud;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Materia;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class MateriaDAO {

	public static void novaMateria(Materia m) {
		
		int id = 0;

		// Gravando o cliente ao banco
		ResultSet resultSet = null;
		try {
					

			CRUD crud = new CRUD();
			resultSet = crud.getResultSet(
					"INSERT INTO MATERIA (nome) VALUES ('" + m.getNomeMateria()+ "');CALL IDENTITY();");

			if (resultSet.next())
				id = resultSet.getInt(1);// obtendo o idretornado CALL
											// IDENTITY();
			m.setIdMateria(id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	
public static ObservableList<Materia> getTodasMaterias() {
		
		int id = 0;
		ObservableList<Materia> lista = FXCollections.observableArrayList();
		

		// Gravando o cliente ao banco
		ResultSet resultSet = null;
		try {
					

			CRUD crud = new CRUD();
			resultSet = crud.getResultSet("SELECT * FROM MATERIA");

			while (resultSet.next()){
				lista.add(new Materia(resultSet.getInt("idMateria"), resultSet.getString("nome")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return lista;

	}
}
