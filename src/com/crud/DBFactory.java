package com.crud;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.CRUDException;



public class DBFactory {

	public List<String> comandosDeCriacao = new ArrayList<>();

	public DBFactory() {
		// String criarTabelaUsuarios = "CREATE TABLE USUARIOS (" + "id INTEGER
		// IDENTITY PRIMARY KEY,"
		// + "LOGIN VARCHAR(50)," + "senha VARCHAR(100)," + ");";

		String criarTabelaUsuarios = "CREATE TABLE USUARIOS (" + "id INTEGER IDENTITY PRIMARY KEY,"
				+ "LOGIN VARCHAR(50)," + "senha VARCHAR(100)," + ");";
		this.comandosDeCriacao.add(criarTabelaUsuarios);
		// nomeCliente, cpfCliente, notasSobreCliente

		this.comandosDeCriacao.add(criarTabelaUsuarios);

		
		String criarTabelaQuestoes = "CREATE TABLE QUESTAO (" + "idquestao INTEGER IDENTITY PRIMARY KEY, idmateria INTEGER, "
				+ "pergunta VARCHAR(500)," + "resposta VARCHAR(500)," + ");";

		this.comandosDeCriacao.add(criarTabelaQuestoes);
		
		String criarTabelaMaterias = "CREATE TABLE MATERIA (" + "idmateria INTEGER IDENTITY PRIMARY KEY, "
				+ "nome VARCHAR(200)," + ");";

		this.comandosDeCriacao.add(criarTabelaMaterias);

		
	}
		

	public boolean criarBancos(CRUD crud) throws ClassNotFoundException, SQLException, CRUDException {

		for (String comando : comandosDeCriacao) {
			crud.getResultSet(comando);
		}
		return true;
	}
	


}
