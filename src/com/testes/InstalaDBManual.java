package com.testes;

import java.sql.SQLException;

import com.crud.CRUD;
import com.crud.DBFactory;
import com.exceptions.CRUDException;
import com.model.Usuario;

public class InstalaDBManual {

	public static void main(String[] args) {
		Usuario user = new Usuario("michel", "livre");
		CRUD crud = new CRUD(user);
		DBFactory dbf = new DBFactory();
		try {
			dbf.criarBancos(crud);
		} catch (ClassNotFoundException | SQLException | CRUDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
