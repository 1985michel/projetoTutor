package com.testes;

import java.util.List;

import com.crud.QuestaoDAO;
import com.model.Questao;

public class TesteGetAllQuestoes {

	public static void main(String[] args) {
		
		List<Questao> lista = QuestaoDAO.getTodasQuestoes();
		System.out.println(lista.size());

	}

}
