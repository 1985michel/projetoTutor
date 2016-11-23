package com.testes;

import com.crud.QuestaoDAO;
import com.model.Questao;

public class TesteCriarQuestao {

	public static void main(String...args){
		Questao q = new Questao(1,"Qual seu nome?","Michel");
				
		QuestaoDAO.novaQuestao(q);
		
		System.out.println("ID: "+q.getIdQuestao());
	}
}
