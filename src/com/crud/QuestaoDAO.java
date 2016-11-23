package com.crud;

import java.sql.ResultSet;

import com.model.Materia;
import com.model.Questao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class QuestaoDAO {

	public static void novaQuestao(Questao q) {

		int id = 0;

		// Gravando o cliente ao banco
		ResultSet resultSet = null;
		try {

			CRUD crud = new CRUD();
			resultSet = crud.getResultSet("INSERT INTO QUESTAO (idMateria, pergunta, resposta) VALUES ('"
					+ q.getIdMateria() + "','" + q.getPergunta() + "','" + q.getResposta() + "');CALL IDENTITY();");

			if (resultSet.next())
				id = resultSet.getInt(1);// obtendo o idretornado CALL
											// IDENTITY();
			q.setIdQuestao(id);

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

	public static ObservableList<Questao> getTodasQuestoes() {

		int id = 0;
		ObservableList<Questao> lista = FXCollections.observableArrayList();

		// Gravando o cliente ao banco
		ResultSet resultSet = null;
		try {

			CRUD crud = new CRUD();
			resultSet = crud.getResultSet("SELECT * FROM QUESTAO");

			while (resultSet.next()) {
				lista.add(new Questao(resultSet.getInt("idquestao"),resultSet.getInt("idmateria"), resultSet.getString("pergunta"), resultSet.getString("resposta")));
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
